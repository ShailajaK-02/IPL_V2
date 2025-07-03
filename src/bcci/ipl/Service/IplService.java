package bcci.ipl.Service;

import bcci.ipl.Entity.Team;
import bcci.ipl.Helper.TeamGenerator;

public class IplService {

	//1.Get all the details of all the teams 
	// create array of teams and iterate it 
	
	public void getdetails() {
		
		Team rcbteam = TeamGenerator.getRCBTeam();
		Team miteam = TeamGenerator.getMITeam();
		Team cskteam = TeamGenerator.getCSKTeam();
		Team dcteam = TeamGenerator.getDCTeam();
		Team gtteam = TeamGenerator.getGTTeam();
		Team kkrteam = TeamGenerator.getKKRTeam();
		Team lsgteam = TeamGenerator.getLSGTeam();
		Team pkteam = TeamGenerator.getPKTeam(); 
		Team rjteam = TeamGenerator.getRRTeam();
		Team srhteam = TeamGenerator.getSRHTeam();
		Team[] teamArray = {rcbteam , miteam, cskteam, dcteam, gtteam, kkrteam, lsgteam, pkteam, rjteam, srhteam};
				
		printdetails(teamArray);
		
	}
	
	private void printdetails(Team[] teamArray) {
		
		for(int i=0; i< teamArray.length; i++) {
			System.out.println(teamArray[i]);
		}
	}
	
	//2.Print the details of specific team as per input .
	// use switch case to print the details of specific team 
	// take input from main class.
	
	   public void printSpecificDetails(String str) {
					
			switch(str) {
			
			case "RCB":
				Team rcb = TeamGenerator.getRCBTeam();
				printDetails(rcb);
				break;
				
			case "MI":
				Team mi = TeamGenerator.getMITeam();
				printDetails(mi);				
				break;
				
			case "CSK":
				Team csk = TeamGenerator.getCSKTeam();
				printDetails(csk);
				break;
				
			case "DC":
				Team dc = TeamGenerator.getDCTeam();
				printDetails(dc);
				break;
			
			case "GT":
				Team gt = TeamGenerator.getGTTeam();
				printDetails(gt);
				break;
				
			case "KKR":
				Team kkr = TeamGenerator.getKKRTeam();
				printDetails(kkr);
				break;
				
			case "LSG":
				Team lsg = TeamGenerator.getLSGTeam();
				printDetails(lsg);		
				break;
				
			case "PK":
				Team pk = TeamGenerator.getPKTeam();
				printDetails(pk);
				break;
				
			case "RR":
				Team rr = TeamGenerator.getRRTeam();
				printDetails(rr);
				break;
				
			case "SRH":
				Team srh = TeamGenerator.getSRHTeam();
				printDetails(srh);
				break;
				
			default:
				System.out.println("Invalid team name");

			}
	} 
	   
	  private void printDetails(Team team) {
		  
		  System.out.println(team.getTeamId());
		  System.out.println(team.getTeamName());
		  System.out.println(team.getcaptainName());
		  System.out.println(team.getIsEliminated());
		  System.out.println(team.getnetRunRate());

	  }
	 //task 4 Get names of eliminated teams using getteamname 
		
		  public void Eliminated() {
		  
		   Team rcbteam = TeamGenerator.getRCBTeam(); 
	       Team miteam = TeamGenerator.getMITeam();
		   Team cskteam = TeamGenerator.getCSKTeam();
		   Team dcteam = TeamGenerator.getDCTeam();
		   Team gtteam = TeamGenerator.getGTTeam(); 
		   Team kkrteam = TeamGenerator.getKKRTeam();
		   Team lsgteam = TeamGenerator.getLSGTeam();
		   Team pkteam = TeamGenerator.getPKTeam(); 
		   Team rjteam = TeamGenerator.getRRTeam(); 
		   Team srhteam = TeamGenerator.getSRHTeam(); 
		   Team[] teamArray = {rcbteam , miteam,cskteam, dcteam, gtteam, kkrteam, lsgteam, pkteam, rjteam, srhteam};
		  
		   for(int i=0; i< teamArray.length; i++) { 
			   Team t = teamArray[i];
		  
		  if(t.getIsEliminated() == true) { 
			   System.out.println(t.getTeamName());
		  }
		 		     
		  }
	    }

		//task 5 Get names of non eliminated teams using getteamname 
	  public void NONEliminated() {
			
			Team rcbteam = TeamGenerator.getRCBTeam();
			Team miteam = TeamGenerator.getMITeam();
			Team cskteam = TeamGenerator.getCSKTeam();
			Team dcteam = TeamGenerator.getDCTeam();
			Team gtteam = TeamGenerator.getGTTeam();
			Team kkrteam = TeamGenerator.getKKRTeam();
			Team lsgteam = TeamGenerator.getLSGTeam();
			Team pkteam = TeamGenerator.getPKTeam(); 
			Team rjteam = TeamGenerator.getRRTeam();
			Team srhteam = TeamGenerator.getSRHTeam();
			Team[] teamArray = {rcbteam , miteam, cskteam, dcteam, gtteam, kkrteam, lsgteam, pkteam, rjteam, srhteam};

			for(int i=0; i< teamArray.length; i++) {
				Team t = teamArray[i];
				
				if(t.getIsEliminated() == false) {
				System.out.println(t.getTeamName());
				}
			}	
		}   
}
//public void printTeamsByEliminationStatus(boolean isEliminated) {
  //  System.out.println(isEliminated ? "Eliminated Teams:" : "Non-Eliminated Teams:");
    //for (Team t : teamArray) {
      //  if (t.getIsEliminated() == isEliminated) {
        //    System.out.println(t.getTeamName());
        //}
