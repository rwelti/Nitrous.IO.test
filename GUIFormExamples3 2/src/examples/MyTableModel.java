/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import javax.swing.table.*;
/**
 *
 * @author russwelt
 */
public class MyTableModel extends DefaultTableModel {

   public interface Reorderable {
      public void reorder(int fromIndex, int toIndex);
   }
    public MyTableModel(Object rowData[][], Object columnNames[]) {
        super(rowData, columnNames);
      }
}
