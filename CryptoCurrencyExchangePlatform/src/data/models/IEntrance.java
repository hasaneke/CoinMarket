/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data.models;

/**
 *
 * @author hasan
 */
public interface IEntrance {
    void signUp(String email, String password);
    boolean signIn(String email, String password);
    boolean checkIfEmailExist(String email);
    boolean logOut();
}
