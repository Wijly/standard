package com.day18;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//(interface)Externalizable
//serializable�� ���� �������̽��� ���� ����� �ϵ�
// �� �� �Ϻ��� ��� �����ϴ�.
// writeExternal(), readExternal() �޼ҵ带 �����ؾ��Ѵ�.

class DataText implements Externalizable{

	String name;
	int age;
	
	public DataText() {
	}
	
	public DataText(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
		
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String)in.readObject();		// �˾Ƽ� �ڵ����� name�� age�� �־����
		age = in.readInt();
		System.out.println("[readExternal]");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(age);
		System.out.println("[writeExternal]");
		
	}
}


public class Test10 {

	public static void main(String[] args) {
		
		DataText ob = new DataText("�ٽ���", 22);
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out10.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out10.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataText t = (DataText)ois.readObject();
			System.out.println(t.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
