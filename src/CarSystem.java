/*author=clevertang
 * email:961577196@qq.com
 * ������ҵ�������п��Ƶ��⳵ϵͳ
 */

import java.util.*;
import java.util.List;



import java.util.ArrayList;
public class CarSystem {
	 public static void main(String[] args){
		 System.out.println("��ӭʹ��clever�⳵ϵͳ");
		 System.out.println("���Ƿ�Ҫ�⳵��1ȷ�ϣ�2�˳�");
		
		 boolean flag=true;
		 while(flag){
			 Scanner c=new Scanner(System.in);
			 int k=c.nextInt();
		 if(k==1){
			 flag=false;
			 System.out.println("�����⳵�����ͼ���Ŀ��");
			 Car[] carForRent={new Bus(1,"�µ�A6",500,4),new Bus(2,"�����ͳ�",1000,40),new Truck(3,"����Ƥ��",600,2,4000),
					 new Van(4,"��Ż���",1000,10000)};
			 System.out.println("���"+"\t"+"����"+"\t"+"���"+"\t"+"\t"+"����");
			 //��ӡ�����������ϸ��Ϣ
			 for(int a=0;a<carForRent.length;a++){
			//��instanceof���ж���ߵĶ����Ƿ����ұ����ʵ��������һ������ֵ
				 System.out.println(1+"\t"+"�µ�A6"+"\t"+500+"\t"+4);
				 System.out.println(2+"\t"+"�����ͳ�"+"\t"+1000+"\t"+40);
				 System.out.println(3+"\t"+"����Ƥ��"+"\t"+600+"\t"+2+"\t"+4000);
				 System.out.println(4+"\t"+"��Ż���"+"\t"+1000+"\t"+10000);
				System.out.println("����Ҫ�⳵������"); 
				int totalNum=c.nextInt();
				//���ü��Ͽ��list���ڴ洢�ͻ��⳵���嵥
				List<Car> carList=new ArrayList<Car>();
				int p=0;//������չcalList������
				List<Car> carListBus=new ArrayList<Car>(); //������������˵ĳ���
	            List<Car> carListTruck=new ArrayList<Car>();  //����������ػ��ĳ���
	            int totalPassenger=0;; //�����洢�ܵ�������
	            int totalCarrayCargo=0; //�����洢�ܵ��ػ���
	            int totalMoney=0; //���������⳵�����ʽ�
	            /*
	             * ��Ҫ˼�룺��ѭ����������ӿͻ��⳵����ţ��ü��Ͽ��List���洢�ͻ���ĳ�����
	             * ͬʱ�ڿͻ�������ŵ�ʱ�������ֳ������бȶԣ�������Ӧ���������������ػ����Լ��⳵�����ʽ�
	             * ͬʱ��ӵ����˳��������ػ���������
	             */
	            for(int i=0;i<totalNum;i++){
	            	System.out.println("�������"+(i+1)+"���������");
	            	int num=c.nextInt();
	            	carList.add(carForRent[num-1]);
	            	System.out.println("�ɹ���ӣ�"+carList.get(p).getName());
	            	if(carForRent[num-1] instanceof Bus){
	                    totalPassenger+=((Bus)carList.get(p)).getCarry();
	                    totalMoney+=((Bus)carList.get(p)).getPayMoney();
	                    carListBus.add(carList.get(p));
	                }
	                if(carForRent[num-1] instanceof Truck){
	                    totalPassenger+=((Truck)carList.get(p)).getCarry();
	                    totalCarrayCargo+=((Truck)carList.get(p)).getCargoCarry();
	                    totalMoney+=((Truck)carList.get(p)).getPayMoney();
	                    carListBus.add(carList.get(p));
	                    carListTruck.add(carList.get(p));
	                }
	                if(carForRent[num-1] instanceof Van){
	                    totalCarrayCargo+=((Van)carList.get(p)).getCargoCarry();
	                    totalMoney+=((Van)carList.get(p)).getPayMoney();
	                     carListTruck.add(carList.get(p));
	                }
	                p++;
	            }
	             
	            System.out.println("�������⳵��������");
	            int carRenDay=c.nextInt();
	            totalMoney=totalMoney*carRenDay;
	             
	            System.out.println("********************�����˵ĳ���********************");
	            for (Car car1 : carListBus) {
	                System.out.println(car1.getName());
	            }
	             
	            System.out.println("********************���ػ��ĳ���********************");
	            for (Car car1 : carListTruck) {
	                System.out.println(car1.getName());
	            }
	             
	            System.out.println("********************�⳵���ܼ۸�********************");
	            System.out.println(totalMoney*carRenDay);
	             
			 }
		 }else if(k==2){
			 flag=false;
	          System.out.println("��л�����ٴ�ʹ�ã��ټ���");
	             
	        }
		 else{
			 
			 System.out.println("���������Ϣ�д�����������");
	     
	            
	   		 	
	   		 	
	            }
			 
			 
		 
	 }
	 }
}


