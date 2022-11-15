package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {

    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");



        List<String> roleList = Arrays.asList(roleArray);
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        roleList.forEach(role -> {
            if(role.startsWith("ROLE_")) {
                validRoleList.add(role);
            }
        });
        System.out.println(validRoleList);

//        roleList.forEach(role -> {
//            if(role.endsWith("MANAGER" || role.endsWith("ADMIN")) {
//                validRoleList.add(role);
//            }
//        });

//           role.endsWith("MANAGER || role.endsWith("ADMIN")

//        System.out.println(roleList);

//        for(String role: roleArray){
//            System.out.println(role);
//        }

//        List<String> roleList = new ArrayList<String>();
//
//        for(String role : roleArray) {
//            roleList.add(role);
//        }
//        System.out.println(roleList);

    }
}
