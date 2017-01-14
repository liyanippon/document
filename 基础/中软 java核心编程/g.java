import java.util.Scanner;
/*if(p==tt[i-1]){
	i--;
	continue;
}else{tt[i]=p;}*/
public class fg {
	public static void main(String[] args) {
		int temp=0;
		int tt[]=new int[5];
		int i;
		int num=0;
		String a;
		System.out.println("请输入三个数（1-12）");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		tt[0]=(int)((13-1)*Math.random()+1);
		for(i=1;i<5;i++){
			int p=(int)((13-1)*Math.random()+1);
			for(int j=0;j<i;j++){
				
				if(tt[j]==p){
					num++;
					j=i;
				}
			}
			if(num==0){
				tt[i]=p;
			}else{
				i--;
				continue;
			}
		}
		for(int t=0;t<5;t++){
			System.out.println(tt[t]);
		}
   		for(int j=0;j<5;j++){
   			if(a1==tt[j]||a2==tt[j]||a3==tt[j]){
   				temp=temp+1;
   			}
   		}
   		if(temp==3){
   			System.out.println("恭喜您中奖");
   			System.out.println("是否再来一次（Y/N）");
   			a=sc.next();
   		}else{
   			System.out.println("请再接再厉");
   			System.out.println("是否再来一次（Y/N）");
   			a=sc.next();
   		}
		/*do{
	   		for(i=0;i<5;i++){
				int p=(int)((13-1)*Math.random()+1);
				if(i==0){
					tt[i]=p;
					continue;
				}else{
					for(int j=0;j<i;j++){
						
						if(tt[j]==p){
							//System.out.println(p);
							break;
						}else{
							num++;
						}
						
					}
				}
				if(num+1==i){
					tt[i]=p;
				}else{
					i--;
					continue;
				}
	  		}
	   		for(int t=0;t<5;t++){
				System.out.println(tt[t]);
			}
	   		for(int j=0;j<5;j++){
	   			if(a1==tt[j]||a2==tt[j]||a3==tt[j]){
	   				temp=temp+1;
	   			}
	   		}
	   		if(temp==3){
	   			System.out.println("恭喜您中奖");
	   			System.out.println("是否再来一次（Y/N）");
	   			a=sc.next();
	   		}else{
	   			System.out.println("请再接再厉");
	   			System.out.println("是否再来一次（Y/N）");
	   			a=sc.next();
	   		}
		}while(a=="Y"||a=="y");*/
	}
}



