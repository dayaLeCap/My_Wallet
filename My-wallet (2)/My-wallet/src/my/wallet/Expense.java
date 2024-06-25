package my.wallet;

import javax.swing.table.DefaultTableModel;

public class Expense {

    //attribute
    private int id;
    private String type;
    private String date;
    private double amount;

    //constructor
    public Expense(int id, String type, String date, double amount) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void addOperation(Expense expense,DefaultTableModel model) {
        String[] attributes = {"ID", "TYPE", "DATE", "AMOUNT"};
       
        Object[] row = new Object[attributes.length];

        for (int i = 0; i < attributes.length; i++) {
            switch (attributes[i]) {
                case "ID" -> row[i] = expense.getId();
                case "TYPE" -> row[i] = expense.getType();
                case "DATE" -> row[i] = expense.getDate();
                case "AMOUNT" -> row[i] = expense.getAmount();
            }
        }
        model.addRow(row);
    }  
}
