package test;

public class test {
	public static void main(String[] args) {
		
		int number[] = {3,5,7,9,11,13,15};
		
		//1-1 配列0と３の合計値
		
		System.out.println("合計は" + (number[0] + number[3])  + "です。");
		
		//1_2 配列1と２の掛け算
		System.out.println("乗算は" + (number[1] * number[2])  + "です。");
		
		//1_3 for文を使って全部出力
		for (int i = 0; i < number.length; i++) {
			System.out.println("number[" + i +"] ..." + number[i]);
		}
		
		//1_4 条件分岐
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 15 == 0) {
				System.out.println("c");
			} else if (number[i]  % 5 == 0) {
				System.out.println("a");
			} else if (number[i]  % 3 == 0) {
				System.out.println("b");
			} else {
				System.out.println("d");
			}
		}
		
		//1_5 テーブル記載
//		Insert into staff 
//		(Id, name, entrance_year, section)
//		Values
//		('1234', 'Road', '2017', 'null');
		
		//1_6 削除文
		//Delete from staff where id = '0001' OR id = '0002';
		
		
		
	}
	
}
