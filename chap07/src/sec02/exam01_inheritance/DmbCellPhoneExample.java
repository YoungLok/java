package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone=new DmbCellPhone("�ڹ���","����",10);
		
		
		
		System.out.println("��:"+dmbCellPhone.model);
		System.out.println("����:"+dmbCellPhone.color);
		
		
		System.out.println("ä��:"+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.recieveVoice("�ȳ��ϼ���");
		dmbCellPhone.sendVoice("���� ��ħ�Դϴ�");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
	

}
