package Question2;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String CompanyName,String... models) {
		
		for(int j=0;j<models.length;j++) {
		
		for(int i=0;i<this.outdatedModels.length;i++) {
			
		
			if(this.outdatedModels[i].equals(models[j])) {
				
				System.out.println(this.outdatedModels[i]+"_OUTDATED.");
			break;
			}else {
				System.out.println("Enter Mobile Model is not OUTDATED");
				break;
			}
		}
		}
		
		
	}
	public static void main(String[] args) {

		Mobile mobile=new Mobile();

		mobile.searchOutdatedModel("Nokiya","note3","note4");
		

	}

}
