/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author huynh
 */
public class BranchDTO {
    private String branchID; //5 kitu
    private String branchName;
    private String branchAddress;
    private String branchManager;

    public BranchDTO() {
    }

    public BranchDTO(String branchID, String branchName, String branchAddress, String branchManager) {
        this.branchID = branchID;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.branchManager = branchManager;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    @Override
    public String toString() {
        return "BranchDTO{" + "branchID=" + branchID + ", branchName=" + branchName + ", branchAddress=" + branchAddress + ", branchManager=" + branchManager + '}';
    }

    
    
    
}
