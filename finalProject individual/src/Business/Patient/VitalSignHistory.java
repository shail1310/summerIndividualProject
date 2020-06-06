/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class VitalSignHistory {

    ArrayList<VitalSign> vsList = new ArrayList();

    public VitalSignHistory() {
        vsList = new ArrayList();
    }

    public ArrayList<VitalSign> getVsList() {
        return vsList;
    }

    public void setVsList(ArrayList<VitalSign> vsList) {
        this.vsList = vsList;
    }

    public VitalSign AddVitalSign() {
        VitalSign vitalSign = new VitalSign();
        vsList.add(vitalSign);
        return vitalSign;
    }

    public void removeVitalSign(VitalSign vitalSign) {
        vsList.remove(vitalSign);
    }
}
