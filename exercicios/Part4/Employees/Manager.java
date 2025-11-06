package Part4.Employees;

public non-sealed class Manager extends Employee {

    public Manager() {
        super.setAdm(true);
    }

    public void printFinancialReport(Employee employee){
        switch(employee){
            case Salesman salesman -> {
                System.out.printf("""
                        Total sales of %s : %d
                        """,salesman.getLogin(),salesman.getSalesQuantity());
            }
                
            case Atendant atendant -> {
                System.out.printf("""
                        The %s cash register has a total of $%.2f 
                        """,atendant.getLogin(),atendant.getCashBalance());
            }
            default -> throw new IllegalStateException("Unexpected value: " + employee);
        }
    }

    public void checkTotalSales(){

    }

    @Override
    public boolean isAdm() {
        return true;
    }
}
