package ir.university;

public class Customer extends Person {
    private String phoneNumber;
    private DinnerMenu[] reserveDinner;
    private int numOfReserveDinner;
    private LunchMenu[] reserveLunch;
    private int numOfReserveLunch;

    public Customer(String name, String family, Gender gender, String phoneNumber) {
        super(name, family, gender);
        this.phoneNumber = phoneNumber;
        this.reserveDinner = new DinnerMenu[20];
        this.numOfReserveDinner = 0;
        this.reserveLunch = new LunchMenu[20];
        this.numOfReserveLunch = 0;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DinnerMenu[] getDinnerMenus() {
        return this.reserveDinner;
    }

    public int getNumOfReserveDinner() {
        return this.numOfReserveDinner;
    }

    public void setNumOfReserveDinner(int numOfReserveDinner) {
        this.numOfReserveDinner = numOfReserveDinner;
    }

    public int getNumOfReserveLunch() {
        return this.numOfReserveLunch;
    }

    public void setNumOfReserveLunch(int numOfReserveLunch) {
        this.numOfReserveLunch = numOfReserveLunch;
    }

    public void reserveDinner(DinnerMenu dinnerMenu) {
        this.reserveDinner[this.numOfReserveDinner] = dinnerMenu;
        ++this.numOfReserveDinner;
    }

    public void removeDinner(DinnerMenu dinnerMenu) {
        int indexOfDinner = 0;

        int i;
        for(i = 0; i < this.numOfReserveDinner; ++i) {
            if (this.reserveDinner[i] == dinnerMenu) {
                indexOfDinner = i;
            }
        }

        this.reserveDinner[indexOfDinner] = null;
        --this.numOfReserveDinner;

        for(i = indexOfDinner; i < this.numOfReserveDinner; ++i) {
            this.reserveDinner[i] = this.reserveDinner[i + 1];
            this.reserveDinner[i + 1] = null;
        }

    }

    public void showDinnerReserveNames() {
        for(int i = 0; i < this.numOfReserveDinner; ++i) {
            if (i == this.numOfReserveDinner - 1) {
                System.out.print(this.reserveDinner[i].name);
            } else {
                DinnerMenu var10001 = this.reserveDinner[i];
                System.out.print(var10001.name + " & ");
            }
        }

    }

    public LunchMenu[] getLunchMenus() {
        return this.reserveLunch;
    }

    public void reserveLunch(LunchMenu lunchMenu) {
        this.reserveLunch[this.numOfReserveLunch] = lunchMenu;
        ++this.numOfReserveLunch;
    }

    public void removeLunch(LunchMenu lunchMenu) {
        int indexOfLunch = 0;

        int i;
        for(i = 0; i < this.numOfReserveLunch; ++i) {
            if (this.reserveLunch[i] == lunchMenu) {
                indexOfLunch = i;
            }
        }

        this.reserveLunch[indexOfLunch] = null;
        --this.numOfReserveDinner;

        for(i = indexOfLunch; i < this.numOfReserveLunch; ++i) {
            this.reserveLunch[i] = this.reserveLunch[i + 1];
            this.reserveLunch[i + 1] = null;
        }

    }

    public void showLunchReserveNames() {
        for(int i = 0; i < this.numOfReserveLunch; ++i) {
            if (i == this.numOfReserveLunch - 1) {
                System.out.print(this.reserveLunch[i].name);
            } else {
                LunchMenu var10001 = this.reserveLunch[i];
                System.out.print(var10001.name + " & ");
            }
        }

    }

    public void showDinnerReserved() {
        double price = 0.0D;

        for(int i = 0; i < this.numOfReserveDinner; ++i) {
            price += this.reserveDinner[i].payment();
        }

        double tax = 0.0D;

        int i;
        for(i = 0; i < this.numOfReserveDinner; ++i) {
            tax += this.reserveDinner[i].calculateTax();
        }

        for(i = 0; i < this.numOfReserveDinner; ++i) {
            if (this.reserveDinner[i].getType() == Type.FOOD) {
                System.out.println(this.reserveDinner[i].name);
            } else if (this.reserveDinner[i].getType() == Type.DRINK) {
                System.out.println(this.reserveDinner[i].name);
            }
        }

        System.out.println("Payment : " + price + " & The Tax : " + tax + "\nOrder Finish");
    }

    public void showLunchReserved() {
        for(int i = 0; i < this.numOfReserveLunch; ++i) {
            if (this.reserveLunch[i].getType() == Type.FOOD) {
                System.out.println(this.reserveLunch[i].name);
            } else if (this.reserveLunch[i].getType() == Type.DRINK) {
                System.out.println(this.reserveLunch[i].name);
            }
        }

    }

    public void showReserve() {
        String var10001;
        int i;
        for(i = 0; i < this.numOfReserveDinner; ++i) {
            var10001 = this.reserveDinner[i].name;
            System.out.println(var10001 + this.reserveDinner[i].code);
        }

        for(i = 0; i < this.numOfReserveLunch; ++i) {
            var10001 = this.reserveLunch[i].name;
            System.out.println(var10001 + this.reserveLunch[i].code);
        }

    }

    public String toString() {
        return "Customer :  phoneNumber = '" + this.phoneNumber + "', name = '" + this.name + "', family = '" + this.family + "', gender = " + this.gender + "}";
    }
}

