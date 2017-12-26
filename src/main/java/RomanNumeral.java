import java.util.ArrayList;

public class RomanNumeral {

    private int arabicNumeral;

    private static final String[] thousands = {
            "",
            "M",
            "MM",
            "MMM"
    };

    private static final String[] hundreds = {
            "",
            "C",
            "CC",
            "CCC",
            "CD",
            "D",
            "DC",
            "DCC",
            "DCCC",
            "CM"
    };

    private static final String[] tens = {
            "",
            "X",
            "XX",
            "XXX",
            "XL",
            "L",
            "LX",
            "LXX",
            "LXXX",
            "XC"
    };

    private static final String[] units = {
            "",
            "I",
            "II",
            "III",
            "IV",
            "V",
            "VI",
            "VII",
            "VIII",
            "IX"
    };

    public RomanNumeral (int arabicNumeral){

        this.arabicNumeral = arabicNumeral;

    }

    public int getArabicNumeral() {
        return this.arabicNumeral;
    }

    public String getRomanNumeral() {

        Integer numberToConvert = arabicNumeral;
        String stringifiedNumber = numberToConvert.toString();
        String[] items = stringifiedNumber.split("");
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (String item : items) {
            stringArrayList.add(item);
        }

        while (stringArrayList.size() < 4){
            stringArrayList.add(0, "0");
        }

        String thousandString = stringArrayList.get(0);
        Integer thousandInt = Integer.parseInt(thousandString);
        int thousandIndex = thousandInt;
        String thouResult = "";
        if (thousandIndex != 0) {
            thouResult = thousands[thousandIndex];
        }


        String hundredString = stringArrayList.get(1);
        Integer hundredInt = Integer.parseInt(hundredString);
        int hundredIndex = hundredInt;
        String hundResult = thouResult;
        if (hundredIndex != 0) {
            hundResult = thouResult + hundreds[hundredIndex];
        }

        String tensString = stringArrayList.get(2);
        Integer tensInt = Integer.parseInt(tensString);
        int tensIndex = tensInt;
        String tensResult = hundResult;
        if (tensIndex != 0) {
            tensResult = hundResult + tens[tensIndex];
        }

        String unitString = stringArrayList.get(3);
        Integer unitInt = Integer.parseInt(unitString);
        int unitIndex = unitInt;
        String fullResult = tensResult;
        if (unitIndex != 0) {
            fullResult = tensResult + units[unitIndex];
        }

        return fullResult;

    }
}
