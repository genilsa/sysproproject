
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class tttttt {

    DefaultTableModel d1 = (new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Control Number", "From", "Type", "Date Recieved"
            }
    ) {
        Class[] types = new Class[]{
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean[]{
            false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    });

    DefaultTableModel d = (new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Control Number", "From", "Type", "Date Recieved", "Date Dissemenate", "Disseminate To"
            }
    ) {
        Class[] types = new Class[]{
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false, false

        };

        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    });

    DefaultTableModel tabledriver = (new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Driver's NAme", "License Number"
            }
    ) {
        Class[] types = new Class[]{
            java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean[]{
            false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    });
    
     DefaultTableModel tablecar = (new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Car Name", "Plate Number", "Type", "Color"
    }
) {
    Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
});

}
