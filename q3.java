package MINOR_1_QUES_3;

public class q3

{		q3[] c=new q3[5];
		int i;
		String Name;
		int Noofinnings;
		int totalNoofRuns;
	    float batAvg;
		public CricketPlayer(String name, int noofinnings, int totalNoofRuns,
				float batAvg) {
			super();
			Name = name;
			Noofinnings = noofinnings;
			this.totalNoofRuns = totalNoofRuns;
			this.batAvg = batAvg;
		}
		
	
		 public q3() {
			super();
		}


		q3[] createPlayers() 
				{
			 
					c[0] =new q3("shru", 5,111, 10.0f);
					c[1]=new   q3("shruthi", 13, 900, 800.0f);
					c[2]=new q3("triveni", 10, 300, 180.0f);
					c[3]=new q3("sheshu", 18, 880, 90.0f);
					c[4]=new q3("sachin", 20, 500, 190.0f);
				
					return c;
				}
		
				void printPlayer()
				{
					
					for(i=0;i<c.length;i++)
					{
						System.out.println(" name :"+ c[i].Name);
						System.out.println(" noofinnings :"+ c[i].Noofinnings);
						System.out.println(" totalRuns :"+ c[i].totalNoofRuns);
						System.out.println(" batAvg :"+ c[i].batAvg);
						
					}
					
					
				}
		
		
		 		static q3[] sortPlayers(q3[] c)
		 		{
		 			q3 temp= new q3();
		 			temp=null;
		 			int i;
		 			int j=0;
		 			for(i=1;i<c.length;i++)
		 			{
		 					for(j=0;j<c.length-i;j++)
		 					{
		 						if(c[j].totalNoofRuns>c[j+1].totalNoofRuns)
		 						{
		 							temp=c[j];
		 							c[j]=c[j+1];
		 							c[j+1]=temp;
		 						}
		 						
		 					}
		 				
		 			}
		 			return c;
		 			
		 		}
		
		 		void printPlayer(q3[] c)
				{
					
					for(i=0;i<c.length;i++)
					{
						System.out.println(" name :"+ c[i].Name);
						System.out.println(" noofinnings :"+ c[i].Noofinnings);
						System.out.println(" totalRuns :"+ c[i].totalNoofRuns);
						System.out.println(" batAvg :"+ c[i].batAvg);
						
					}
					
					
				}
		 		
		 		
	}
