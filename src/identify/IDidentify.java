package identify;

import java.util.Random;

public class IDidentify
{
	String ID = ""; // 身分證號
	int total = 0; // 身分證加總
	String countyCN = "'"; // 戶籍地
	String sex = ""; // 性別
	String[] countyN = { "10", "11", "12", "13", "14", "15", "16", "17", "34", "18", "19", "20", "21", "22", "35", "23", "24", "25", "26", "27", "28", "29", "32", "30", "31", "33" };// A-Z對應的數字
	String[] countyC = { "臺北市", "臺中市", "基隆市", "臺南市", "高雄市", "新北市", "宜蘭縣", "桃園市", "嘉義市", "新竹縣", "苗栗縣", "臺中縣", "南投縣", "彰化縣", "新竹市", "雲林縣", "嘉義縣", "臺南縣", "高雄縣", "屏東縣", "花蓮縣", "臺東縣", "金門縣", "澎湖縣", "陽明山管理局", "連江縣" };
	Boolean checkID, calcID, transID;
	Boolean creatStatus = false; // 是否使用creatID方法

	public Boolean checkID(String strID)// 格式檢查
	{
		String ID = strID.toUpperCase();// 轉大寫
		if (ID.matches("[A-Z]\\d{9}"))// 格式檢查
		{
			if (ID.charAt(1) == '1' | ID.charAt(1) == '2') // 性別檢查
			{
				switch (ID.charAt(1))// 取得性別
				{
				case '1':
					sex = "男";
					break;
				case '2':
					sex = "女";
					break;
				}
				countyCN = countyC[ID.charAt(0) - 'A']; // 取得中文戶籍地
				Boolean result = transID(ID);// 呼叫計算方法
				if (result == true)
				{
					System.out.println("身分證有效");
					System.out.println("戶籍地：" + countyCN + "    性別：" + sex);
					return true;
				} else if (result == false & creatStatus == false)
				{
					System.out.println("身分證無效");
				}
				return false;
			} else
			{
				System.out.println("性別有誤");
				return false;
			}
		} else
		{
			System.out.println("格式有誤");
			return false;
		}
	}

	public Boolean transID(String ID) // 格式轉換
	{
		ID = countyN[ID.charAt(0) - 'A'] + ID.substring(1, 10); // 戶籍地轉數字合併原身分證號碼
		// System.out.println("new ID " + ID); // 轉換後身分證
		total = Integer.valueOf(ID.substring(0, 1)) + Integer.valueOf(ID.substring(10, 11)); // 頭尾兩數相加
		for (int i = 1; i < 10; i++) // 中間數字累加
		{
			total += Integer.valueOf(ID.substring(i, i + 1)) * (10 - i);
		}
		return calcID(total);
	}

	public Boolean calcID(int total)// 轉換後計算
	{
		if (total % 10 == 0)
		{
			return true;
		} else
		{
			return false;
		}

	}

	public void creatID()
	{
		Random ran = new Random();
		creatStatus = true;
		do
		{
			ID = (char) (ran.nextInt(26) + 'A') + "";// 決定國籍;
			ID = ID + String.valueOf(ran.nextInt(2) + 1); // 決定性別;
			for (int i = 1; i <= 8; i++)
			{
				ID = ID + ran.nextInt(10);
			}
		} while (checkID(ID) == false);
		System.out.println(ID);
	}

}
