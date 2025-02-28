package DAY7;

import java.io.File;

public class FileHand {

	public static void main(String[] args) {
		File obj = new File("myfile2.text");
		try {
			if (obj.exists())
			{
				System.out.println("file name "+obj.getName());
				System.out.println("file path "+obj.getAbsolutePath());
				System.out.println("file can write? "+obj.canWrite());
				System.out.println("file can read? "+obj.canRead());
				System.out.println("file size... "+obj.length());
			}
			else
				System.out.println("file not found!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}