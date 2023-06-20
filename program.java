/*import org.json.JSONObject;

public class SQLQueryBuilder {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject filterData = new JSONObject(jsonString);
        
        StringBuilder whereClause = new StringBuilder();
        boolean isFirstCondition = true;
        
        for (String key : filterData.keySet()) {
            String value = filterData.getString(key);
            
            if (!value.equals("null")) {
                if (!isFirstCondition) {
                    whereClause.append(" AND ");
                }
                
                whereClause.append(key).append("=").append(value);
                
                isFirstCondition = false;
            }
        }
        
        String sqlQuery = "SELECT * FROM students";
        
        if (whereClause.length() > 0) {
            sqlQuery += " WHERE " + whereClause.toString();
        }
        
        System.out.println(sqlQuery);
    }
}
 */




 /*import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        
        try {
            FileWriter writer = new FileWriter("log.txt");
            
            writer.write("Исходный массив: ");
            printArray(arr, writer);
            writer.write("\n");
            
            bubbleSort(arr, writer);
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void bubbleSort(int[] arr, FileWriter writer) throws IOException {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    // Запись текущего состояния массива в лог-файл
                    writer.write("Итерация " + (i + 1) + ": ");
                    printArray(arr, writer);
                    writer.write("\n");
                }
            }
        }
        
        writer.write("Отсортированный массив: ");
        printArray(arr, writer);
    }
    
    public static void printArray(int[] arr, FileWriter writer) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            writer.write(arr[i] + " ");
        }
    }
}
 */
