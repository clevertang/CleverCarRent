/*author=clevertang
 * email:961577196@qq.com
 * 课堂作业，命令行控制的租车系统
 */

import java.util.*;
import java.util.List;



import java.util.ArrayList;
public class CarSystem {
	 public static void main(String[] args){
		 System.out.println("欢迎使用clever租车系统");
		 System.out.println("您是否要租车？1确认，2退出");
		
		 boolean flag=true;
		 while(flag){
			 Scanner c=new Scanner(System.in);
			 int k=c.nextInt();
		 if(k==1){
			 flag=false;
			 System.out.println("您可租车的类型及价目表");
			 Car[] carForRent={new Bus(1,"奥迪A6",500,4),new Bus(2,"金龙客车",1000,40),new Truck(3,"丰田皮卡",600,2,4000),
					 new Van(4,"解放货车",1000,10000)};
			 System.out.println("序号"+"\t"+"车名"+"\t"+"租金"+"\t"+"\t"+"容量");
			 //打印输出车辆的详细信息
			 for(int a=0;a<carForRent.length;a++){
			//用instanceof来判断左边的对象是否是右边类的实例，返回一个布尔值
				 System.out.println(1+"\t"+"奥迪A6"+"\t"+500+"\t"+4);
				 System.out.println(2+"\t"+"金龙客车"+"\t"+1000+"\t"+40);
				 System.out.println(3+"\t"+"丰田皮卡"+"\t"+600+"\t"+2+"\t"+4000);
				 System.out.println(4+"\t"+"解放货车"+"\t"+1000+"\t"+10000);
				System.out.println("输入要租车的数量"); 
				int totalNum=c.nextInt();
				//调用集合框架list用于存储客户租车的清单
				List<Car> carList=new ArrayList<Car>();
				int p=0;//用来扩展calList的容量
				List<Car> carListBus=new ArrayList<Car>(); //用来储存可载人的车辆
	            List<Car> carListTruck=new ArrayList<Car>();  //用来储存可载货的车辆
	            int totalPassenger=0;; //用来存储总的载人数
	            int totalCarrayCargo=0; //用来存储总的载货量
	            int totalMoney=0; //用来计算租车的总资金
	            /*
	             * 主要思想：用循环遍历在添加客户租车的序号，用集合框架List来存储客户租的车辆。
	             * 同时在客户输入序号的时候与三种车辆进行比对，计算相应车辆的载人数，载货量以及租车的总资金
	             * 同时添加到载人车辆或者载货车辆当中
	             */
	            for(int i=0;i<totalNum;i++){
	            	System.out.println("请输入第"+(i+1)+"辆车的序号");
	            	int num=c.nextInt();
	            	carList.add(carForRent[num-1]);
	            	System.out.println("成功添加："+carList.get(p).getName());
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
	             
	            System.out.println("请输入租车的天数：");
	            int carRenDay=c.nextInt();
	            totalMoney=totalMoney*carRenDay;
	             
	            System.out.println("********************可载人的车有********************");
	            for (Car car1 : carListBus) {
	                System.out.println(car1.getName());
	            }
	             
	            System.out.println("********************可载货的车有********************");
	            for (Car car1 : carListTruck) {
	                System.out.println(car1.getName());
	            }
	             
	            System.out.println("********************租车的总价格********************");
	            System.out.println(totalMoney*carRenDay);
	             
			 }
		 }else if(k==2){
			 flag=false;
	          System.out.println("感谢您的再次使用！再见！");
	             
	        }
		 else{
			 
			 System.out.println("您输入的信息有错！请重新输入");
	     
	            
	   		 	
	   		 	
	            }
			 
			 
		 
	 }
	 }
}


