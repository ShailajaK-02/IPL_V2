package bcci.ipl.Entity;
//This is Encapsulated class because its variable are private and it is entity class 
public class Team {

		private int teamId;
		
		private String teamName;
		
		private String captainName;
		
		private float netRunRate;
		
		private boolean isEliminated;
		
		//Team id 
		public void setTeamId(int teamId) {
				this.teamId =teamId;
		}
		public int getTeamId() {
				return teamId;
		}
		
		//Team name
		public void setTeamName(String teamName) {
			this.teamName=teamName;
		}
		public String getTeamName() {
			return teamName;
		}
		
		//captain name
		public void setcaptainName(String captainName) {
			this.captainName=captainName;
		}
		public String getcaptainName() {
			return captainName;
		}
		
		//net run rate
		public void setnetRunRate(float netRunRate) {
			this.netRunRate=netRunRate;
		}
		public float getnetRunRate() {
			return netRunRate;
		}
		
		//is eliminated 
		public void setIsEliminated(boolean isEliminated) {
			this.isEliminated=isEliminated;
		}
		public boolean getIsEliminated() {
			return isEliminated;
		}
		@Override
		public String toString() {
			return "Team [teamId=" + teamId + ", teamName=" + teamName + ", captainName=" + captainName
					+ ", netRunRate=" + netRunRate + ", isEliminated=" + isEliminated + "]";
		}
		
		
}
