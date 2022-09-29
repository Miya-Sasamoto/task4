package check;

import constants.Constants;

public class Check {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1 インスタンス生成
		Check2 test1= new Check2(Constants.firstName1,Constants.lastName1,Constants.age1);

		//2 インスタンス生成
		Check2 test2 = new Check2(Constants.firstName2,Constants.lastName2,Constants.age2);
		
		//3 二人の名前表示
		System.out.println("二人の名前は" + test1.getFirstName() + test1.getLastName()  + "と" + test2.getFirstName() + test2.getLastName() + "です");
		
		System.out.println(test1.getFirstName() + test1.getLastName() + test1.getAge() + "才");
		System.out.println(test2.getFirstName() + test2.getLastName() + test2.getAge() +  "才");
		
	
	}

}
