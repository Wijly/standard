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
//serializable의 하위 인터페이스로 같은 기능을 하되
// 좀 더 완벽한 제어가 가능하다.
// writeExternal(), readExternal() 메소드를 정의해야한다.

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
		
		name = (String)in.readObject();		// 알아서 자동으로 name과 age를 넣어놓음
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
		
		DataText ob = new DataText("다스리", 22);
		
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
