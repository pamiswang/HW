package identify;

import java.util.Random;

public class IDidentify
{
	String ID = ""; // �����Ҹ�
	int total = 0; // �����ҥ[�`
	String countyCN = "'"; // ���y�a
	String sex = ""; // �ʧO
	String[] countyN = { "10", "11", "12", "13", "14", "15", "16", "17", "34", "18", "19", "20", "21", "22", "35", "23", "24", "25", "26", "27", "28", "29", "32", "30", "31", "33" };// A-Z�������Ʀr
	String[] countyC = { "�O�_��", "�O����", "�򶩥�", "�O�n��", "������", "�s�_��", "�y����", "��饫", "�Ÿq��", "�s�˿�", "�]�߿�", "�O����", "�n�뿤", "���ƿ�", "�s�˥�", "���L��", "�Ÿq��", "�O�n��", "������", "�̪F��", "�Ὤ��", "�O�F��", "������", "���", "�����s�޲z��", "�s����" };
	Boolean checkID, calcID, transID;
	Boolean creatStatus = false; // �O�_�ϥ�creatID��k

	public Boolean checkID(String strID)// �榡�ˬd
	{
		String ID = strID.toUpperCase();// ��j�g
		if (ID.matches("[A-Z]\\d{9}"))// �榡�ˬd
		{
			if (ID.charAt(1) == '1' | ID.charAt(1) == '2') // �ʧO�ˬd
			{
				switch (ID.charAt(1))// ���o�ʧO
				{
				case '1':
					sex = "�k";
					break;
				case '2':
					sex = "�k";
					break;
				}
				countyCN = countyC[ID.charAt(0) - 'A']; // ���o������y�a
				Boolean result = transID(ID);// �I�s�p���k
				if (result == true)
				{
					System.out.println("�����Ҧ���");
					System.out.println("���y�a�G" + countyCN + "    �ʧO�G" + sex);
					return true;
				} else if (result == false & creatStatus == false)
				{
					System.out.println("�����ҵL��");
				}
				return false;
			} else
			{
				System.out.println("�ʧO���~");
				return false;
			}
		} else
		{
			System.out.println("�榡���~");
			return false;
		}
	}

	public Boolean transID(String ID) // �榡�ഫ
	{
		ID = countyN[ID.charAt(0) - 'A'] + ID.substring(1, 10); // ���y�a��Ʀr�X�֭쨭���Ҹ��X
		// System.out.println("new ID " + ID); // �ഫ�ᨭ����
		total = Integer.valueOf(ID.substring(0, 1)) + Integer.valueOf(ID.substring(10, 11)); // �Y����Ƭۥ[
		for (int i = 1; i < 10; i++) // �����Ʀr�֥[
		{
			total += Integer.valueOf(ID.substring(i, i + 1)) * (10 - i);
		}
		return calcID(total);
	}

	public Boolean calcID(int total)// �ഫ��p��
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
			ID = (char) (ran.nextInt(26) + 'A') + "";// �M�w���y;
			ID = ID + String.valueOf(ran.nextInt(2) + 1); // �M�w�ʧO;
			for (int i = 1; i <= 8; i++)
			{
				ID = ID + ran.nextInt(10);
			}
		} while (checkID(ID) == false);
		System.out.println(ID);
	}

}
