package bcci.ipl.Helper;

import bcci.ipl.Entity.Team;

//Team is entity class 
//Methods for team
public class TeamGenerator {
		
		public static Team getRCBTeam() {
			Team teamRCB = new Team();
			teamRCB.setTeamId(1);
			teamRCB.setcaptainName("virat kohli");
			teamRCB.setTeamName("Royal challengers Banglore");
			teamRCB.setnetRunRate(1.18f);
			teamRCB.setIsEliminated(false);
			return teamRCB;
		}
		
		public static Team getMITeam() {
			Team teamMI = new Team();
			teamMI.setTeamId(2);
			teamMI.setcaptainName("Hardik pandya");
			teamMI.setTeamName("Mumbai indians");
			teamMI.setnetRunRate(1.21f);
			teamMI.setIsEliminated(false);
			return teamMI;
		}
		
		public static Team getCSKTeam() {
			Team teamCSK = new Team();
			teamCSK.setTeamId(3);
			teamCSK.setcaptainName("Ruturaj gaikwad");
			teamCSK.setTeamName("Chennai super kings ");
			teamCSK.setnetRunRate(2.1f);
			teamCSK.setIsEliminated(false);
			return teamCSK;
		}
		
		public static Team getDCTeam() {
			Team teamDC = new Team();
			teamDC.setTeamId(4);
			teamDC.setcaptainName("Axar Patel");
			teamDC.setTeamName("Delhi capitals");
			teamDC.setnetRunRate(1.11f);
			teamDC.setIsEliminated(true);
			return teamDC;
		}
		
		public static Team getGTTeam() {
			Team teamGT = new Team ();
			teamGT.setTeamId(5);
			teamGT.setcaptainName("Shubman Gill");
			teamGT.setTeamName("Gujrat Titans");
			teamGT.setnetRunRate(1.8f);
			teamGT.setIsEliminated(false);
			return teamGT;
		}
		
		public static Team getKKRTeam() {
			Team teamKKR = new Team();
			teamKKR.setTeamId(6);
			teamKKR.setcaptainName("Ajinkya Rahane");
			teamKKR.setTeamName("Kolkata Knight Riders");
			teamKKR.setnetRunRate(1.0f);
			teamKKR.setIsEliminated(true);
			return teamKKR;	
		}
		
		public static Team getLSGTeam() {
			Team teamLSG = new Team();
			teamLSG.setTeamId(7);
			teamLSG.setcaptainName("Rishabh Pant");
			teamLSG.setTeamName("Lucknow super Giants");
			teamLSG.setnetRunRate(0.8f);
			teamLSG.setIsEliminated(true);
			return teamLSG;
		}
		
		public static Team getPKTeam() {
			Team teamPK = new Team();
			teamPK.setTeamId(8);
			teamPK.setcaptainName("Shreyas Iyer");
			teamPK.setTeamName("Punjab Kings");
			teamPK.setnetRunRate(0.8f);
			teamPK.setIsEliminated(false);
			return teamPK;
		}
		
		public static Team getRRTeam() {
			Team teamRJ = new Team();
			teamRJ.setTeamId(9);
			teamRJ.setcaptainName("Sanju samson");
			teamRJ.setTeamName("Rajasthan Royals");
			teamRJ.setnetRunRate(2.1f);
			teamRJ.setIsEliminated(false);
			return teamRJ;
		}
		
		public static Team getSRHTeam() {
			Team teamSRH = new Team();
			teamSRH.setTeamId(10);
			teamSRH.setcaptainName("Pat Cummins");
			teamSRH.setTeamName("Sunrises Hyderabad");
			teamSRH.setnetRunRate(2.2f);
			teamSRH.setIsEliminated(true);
			return teamSRH;
		}

}
