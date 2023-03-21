package day11;

public class VIPCustomer extends Customer {

	
		
		private int agentID;
		double saleRatio;
		
		
		public VIPCustomer() {}
		
		public VIPCustomer(int id, String name, int agentid) {
			super(id, name);
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
			this.agentID = agentid;
		}

		
		@Override
		public int calcPrice(int price) {  
			bonusPoint += (int)(price*bonusRatio);
			return price-(int)(price*saleRatio);
		}

		
		
		@Override
		public String customerInfo() {
			return super.customerInfo()+"당신의 상담사 번호는"+agentID+" 입니다.";
		}

		public int getAgentID() {
			return agentID;
		}
		
		
		
//		@Override
//		public String customerInfo() {
//			return super.customerInfo()+"당신의 당당은"+(int)((Math.random()*1000)+1)+"번 입니다.";
//		}

		



	
			
	
}
