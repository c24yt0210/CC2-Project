package college;

import java.util.Scanner;

public class College {

    public static void main(String[] args) {

        System.out.println("WELCOME TO UNIVERSITY OD CORDILLERAS");
        String College, Department, Major;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your college deparment:");
        College = sc.nextLine();
        if (College.equals("College of Arts and Science")) {
            System.out.println("What is yout Academic program: English, Political Science, Communication, Psychology ");
            Department = sc.nextLine();
            if (Department.equals("English")) {
                System.out.println("College is " + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Political Science")) {
                System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Communication")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Psychology")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else {
                System.out.println("invalid");
            }
        } else if (College.equals("College of Business Administration")) {
            System.out.println("What is your Academic program? Bachelor of Science in Business Administration,Bachelor of Science in Entrpreneurship, Bachelor of Science in Office Administrayion");
            Department = sc.nextLine();
            if (Department.equals("Business Administration")) {
                System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Entrepreneurship")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Office Administration")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else {
                System.out.println("invalid");
            }
        } else if (College.equals("College of Engineering and Architecture")) {
            System.out.println("What is your Academic program: Achitecture, Civil Engineering, Computer Engineering, Electronic Engineering, Environmental & Sanitary Engineering");
            Department = sc.nextLine();
            if (Department.equals("Architecture")) {
                System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Civil Engineering")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Computer Engineering")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Electronic Engineering")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Electronic Engineering")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Environment & Sanitary Engineering")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else {
                System.out.println("invalid");
            }
        } else if (College.equals("College of information Technology and Computer Science")) {
            System.out.println("What is your Academic program: Computer Science, Information System, Information Technology, Computer technology");
            Department = sc.nextLine();
            if (Department.equals("Computer Science")) {
                System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Information System")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Information Technology")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Computer Technology")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else {
                System.out.println("invalid");
            }
        } else if (College.equals("College of Teacher Education")) {
            System.out.println("What is your Academic program: Elementary Education-general , Elementary Education, Secondary Education");
            Department = sc.nextLine();
            if (Department.equals("Elementary Education - General")) {
                System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Elementary Education")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Elementary Education")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else if (Department.equals("Secondary Education")) {
                System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts in" + Department);
            } else {
                System.out.println("invalid");
            }
        }
    }
}
