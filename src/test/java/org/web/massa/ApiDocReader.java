package org.web.massa;

import org.web.massa.enums.TestsEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApiDocReader {

    public static Map<String, String> getCSVTestData (TestsEnum scenarioTag) throws Exception {
        String[] dataString = Reader(scenarioTag.toString(), "TestData.csv");
        List<String> dataList = Arrays.stream(dataString[1].split(";")).collect(Collectors.toList());
        return dataList.stream().collect(Collectors.toMap(s -> s.split(":")[0].trim(), s -> s.split(":")[1].trim()));
    }

    public static String[] Reader (String Index, String file) throws IOException {
    String baseDir = "src/test/java/org/web/massa/csvFiles/";
    BufferedReader csvReader = new BufferedReader(new FileReader(baseDir + file));
    String line;
    String[] data = null;
    while ((line = csvReader.readLine()) != null) {
        String[] lineSplited = line.split(",");
        if (Index.equals(lineSplited[0])){
            data=lineSplited;
            break;
        }
    }
    csvReader.close();
    return data;
    }
}
