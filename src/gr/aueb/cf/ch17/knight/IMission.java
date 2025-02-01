package gr.aueb.cf.ch17.knight;
public interface IMission {
    MissionStatus getStatus ();
    void setStatus(MissionStatus missionStatus); //Started or Not Started
    void embark();
}
