package com.example.kanjilearn;

import java.util.ArrayList;

public interface DataCommunication {
    public String getMyVariableX();
    public void setMyVariableX(String x);
    public int getMyVariableY();
    public void setMyVariableY(int y);

    public MyAdapter getMyAdapter ();
    public void setMyAdapter (ArrayList<SingleRow> adapterdada);

    public void setMyMass (String[] mass);
    public String[] getMyMass();

    public void setMyMassInt (int[] massInt);
    public int[] getMyMassInt();
}
