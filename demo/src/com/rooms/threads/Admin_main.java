package com.rooms.threads;

public class Admin_main extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("                .  .     .         .........         .   .   ...\r\n" + 
					"                   ..  .    .......::::::::::::::......     ....\r\n" + 
					"                          .....::::::....:::::::::::....   ..\r\n" + 
					"       ..          .  ...:::..:::...:::..:::.::::..::::::...   .     .\r\n" + 
					"     ....   ..   ..  ..::::::::..::::.:::::::::::..::::::::...       ..\r\n" + 
					"..   ....          ...:::.:.::.:::..:::.:::::..:.::.::..:::....       .\r\n" + 
					"..       ...  . ...::.::::::::::..::::...::....:.:::...::.:::::..   .     .  . .\r\n" + 
					"       .  ..   ...:::::::::::::::...::::::::.......:...:::::.:::...       .  .\r\n" + 
					"       .  .   .:::..::서혁호:::.::..::임현재::..::..:위준형:::::::..  .    .  .\r\n" + 
					"         .   ..:...:::::::::::..:::::::......:::::..::::::.:::..:::..   .  .  ..\r\n" + 
					"    ..     ...:.::..::..::.::.::::..::::::::::...:::..::.::::...:::::.. .     ..\r\n" + 
					"   ..  .  ..::.:.:::::..::.::.::..::IIHIIIHIII::::.:..:.::::::::::.:::..  .  .\r\n" + 
					"   .. ..  ..:::..:::::..:..:::.:::IIIIIIIIIHHIII::..:..:::::::::::.:::..  .  .\r\n" + 
					"         ..:..:::::::::...:..:::IHHIIIIIIIIIIIIIHI::..:.::::::::::::..::.     ..\r\n" + 
					"        ..::..:::::::::::.::.::IIIIIIIIIIIIIIIIIIII::.::::::::::.:::..::..    .\r\n" + 
					"       ..::::.:::::::.::..:::IIIIIIIIIIIIIIIIIIIIIIII.::::::::......::..:.. .\r\n" + 
					"       ..::::.:::::::.::.::::IIIIIIIIIIIIIIIIIIIIIIIH::.::::::...:::::.:::..\r\n" + 
					"   .  ..::.::.:.::::::::.:.:IIIIIIIIIIIIIIIIIIIIIIIIHI::::::..::::::::::::..   .\r\n" + 
					"   .  .::..::::.::::..::.:::IIIIIIIIIIIIIIIIIIIIIIIIII:::::::::::::::::::::.   .\r\n" + 
					".  .  .::..::.::::::.:::.:::IIIIIIIIIIIIIIIIIIIIIIIIII:::.:::::::::::::::::.   .\r\n" + 
					".  . .:.:::::.:.:::....:::.:IIIIIIIIIIIIIIIIIIIIIHIIII:::..::::::::::::::..:.\r\n" + 
					" . . .:::::::.:::::.....::.:IIIIIIIIIIIIIIIIIIIIIIIIII:::....:::::::::::::.:.. .\r\n" + 
					" . . .::::::::::::..::..:..:IHIIIIIIIIIIIIIIIIIIIHIIHI:::.....::::::::::::.:.. .\r\n" + 
					" .  ..:.::::::::::::::..:.:::HIIIIIIIIIIIIIIIIIIIHIIH::.::......::::::::::.:.. .\r\n" + 
					"  .  ::..:::::::::::::::.:::.:IIIIIIIIIIIIIIIIIIIIIH:.:.::::::::::..::::.:.::\r\n" + 
					"  .  :...:::::::::::::::.:.:::IIIIIIIIIIIIIIIIIIIIII:::.::::::::::..::::.::::\r\n" + 
					" ..  ::..::::::::::::::::::.:.::IIIIIIIIIIIIIIIIHI::..:::::::::::...::::..:::\r\n" + 
					" ..  .:..:::::::::::::::.:.::::::IIIIIIIIIIIIIIHI:..::.:...:::::::..::::..:..  .\r\n" + 
					" .  ..:..:.::.::::::::::.::.:::.:::IIIIIIIIIIII::..:..::.....:::.:....::.:::.. .\r\n" + 
					"  .  .::.:.::::::...:::::.....:::....::::::::::::.:::::.......::::..:::...::..\r\n" + 
					"  . ..::.::.::.:....::::.:::::..:::::..::::..::::...::::.....:::::..:::.:.::..\r\n" + 
					" .  ...:..:.::::....:.::::..:..:.:.::..::::.:..:.::..:::.:::::::::..:::.::.. . .\r\n" + 
					"  . ...:..:.::.::...::..::::::.:::::::::::::::::::::::::.:::.:::::....:::::. . .\r\n" + 
					"  ..  .::.::::..::..::.:..:::IIIIIIIIIIIIIIIIIIIIIHII::::..:::..::::::..::: .\r\n" + 
					"  ..  ..::.::.::..::::..:::IHHIIIIIIIIIIIIIIIIIIIIIIIHI:::..:::::::::::.::. . .\r\n" + 
					"   .   .::..:.::..::.::::IHHIIIIIIIIIIIIIIIIIIIIIIIIIIHIII::..:::::::.::::..  .\r\n" + 
					"     .. ..:.::..::::::IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHIIIIII:.:::..:::::..\r\n" + 
					"  .     ..:..:.:::.::IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI::.::..:::...  .\r\n" + 
					"    .    ..::.:::.:IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII::::.:::..\r\n" + 
					"       .  ..::.::.:IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII::...:::..  .  .\r\n" + 
					"           ...::.::IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII:.:::..   .  ..\r\n" + 
					"            ..::.::IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII:.::..       ..\r\n" + 
					".         .  ..::::IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII::::...     .\r\n" + 
					"              ...::IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII:..   .. .\r\n" + 
					"                .::IHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII... . ..     .\r\n" + 
					"                ...:HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHIII. .. . .\r\n" + 
					"       ...      .. .:HHHIIIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHIIH:.  .. ...\r\n" + 
					"      ....          ....IHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI.. . ..\r\n" + 
					"      ....         .   ..:IHIIHIIIIIIIIIIIIIIIIIIIIIIIII:. .. . .  .\r\n" + 
					"           ......      .. ..:IIIIIIIIIIIIIIIIIIIIIHHI:....   .    .\r\n" + 
					"                    .    .    . ...::IIIHHIII::... ...  .....\r\n" + 
					"	");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}