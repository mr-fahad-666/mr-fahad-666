class Student {
    int rollNo;
    String sName;
    String scourse;
    long hallTicket;
    String address;

    Student(int rollNo, String sName, String scourse, long hallTicket, String address) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.scourse = scourse;
        this.hallTicket = hallTicket;
        this.address = address;
    }

}

class College {
    void m1() {
        Student s = new Student(101, "HK", "fULL sTACH", 79998989L, "aMEERTPET");
        System.out.println("RollNo " + s.rollNo);
        System.out.println("Name " + s.sName);
        System.out.println("Course " + s.scourse);
        System.out.println("HallTicketNO. " + s.hallTicket);
        System.out.println("Address " + s.address);

    }

    Student m2() {
        Student s = new Student(102, "BK", "fULL sTACH", 8686020767L, "malakpet");
        System.out.println();
        System.out.println("RollNo " + s.rollNo);
        System.out.println("Name " + s.sName);
        System.out.println("Course " + s.scourse);
        System.out.println("HallTicketNO. " + s.hallTicket);
        System.out.println("Address " + s.address);


        return s;
    }
}

class Test {
    public static void main(String[] args) {
        College c = new College();
        c.m1();
        c.m2();
    }
}
