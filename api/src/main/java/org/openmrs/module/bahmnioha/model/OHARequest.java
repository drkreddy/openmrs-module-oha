package org.openmrs.module.bahmnioha.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by dreddy on 13/03/18.
 */
public class OHARequest {
    String API_KEY = "NWEzOTFjMDUyMTg2NQ==";

    String ALGORITHM_ID= "5a391c0521865";

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    Data data = new Data();

//    public static void main(String... args) throws IOException {
//        OHARequest ohaRequest = new OHARequest();
//        Gson gson = new Gson();
//        String str=gson.toJson(ohaRequest);
//       // System.out.println(str);
//        String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImNiYWYyMTNhMmQxMTliYzRkOWZhOThlOGE3YTEwNjIxNjE2YWIxNDdlZjZkNDc2ZWZkMWM5MWI3ZTMxMTRlZmM5NjE1MDg4NzEyNjY1MjRhIn0.eyJhdWQiOiIxIiwianRpIjoiY2JhZjIxM2EyZDExOWJjNGQ5ZmE5OGU4YTdhMTA2MjE2MTZhYjE0N2VmNmQ0NzZlZmQxYz";
//        URL url = new URL("https://developer.openhealthalgorithms.org/api/bahmni/5aaf3d44575be/hearts");
//        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
//        connection.setDoOutput(true);
//        connection.setDoInput(true);
//        connection.setRequestMethod("POST");
//
//        connection.setRequestProperty("Content-Length", "" + Integer.toString(str.getBytes().length));
//        connection.addRequestProperty("Accept", "application/json");
//        connection.addRequestProperty("Content-Type", "application/json");
//        connection.addRequestProperty("Authorization","Bearer "+token);
//
//        connection.connect();
//
//        DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());
//        wr.writeBytes (str);
//        wr.flush ();
//        wr.close ();
//        System.out.println(connection.getResponseCode());
//        InputStream response = connection.getInputStream();
//        String content = new java.util.Scanner(response).useDelimiter("\\A").next();
//        System.out.println(content);
//
//        JsonParser jsonParser = new JsonParser();
//        JsonElement jsonElement = jsonParser.parse(content);
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        JsonElement diabetes = jsonObject.get("diabetes");
//
//        System.out.println( diabetes.toString());
//
//
//    }


public class Data {
    Request request = new Request();

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    Body body = new Body();
}
public class Request{
    String api_key= "4325872943oeqitrqet7";
    String api_secret= "3459823jfweureitu";
    String request_api= "https://developers.openhealthalgorithms.org/algos/hearts/";
    String country_code= "D";
    String response_type= "COMPLETE";
}
public class Body{

    String region = "AFRD";
    Demographics demographics= new Demographics();
    Measurements measurements = new Measurements();
    Smoking smoking = new Smoking();
    int physical_activity = 120;
    DietHistory diet_history = new  DietHistory();
    MedicalHistory medical_history = new MedicalHistory();
    Allergies allergies = new Allergies();
    List<String> medications = Collections.EMPTY_LIST;
    Pathology pathology = new Pathology();



    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Demographics getDemographics() {
        return demographics;
    }

    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public Measurements getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Measurements measurements) {
        this.measurements = measurements;
    }

    public Smoking getSmoking() {
        return smoking;
    }

    public void setSmoking(Smoking smoking) {
        this.smoking = smoking;
    }

    public int getPhysical_activity() {
        return physical_activity;
    }

    public void setPhysical_activity(int physical_activity) {
        this.physical_activity = physical_activity;
    }

    public DietHistory getDiet_history() {
        return diet_history;
    }

    public void setDiet_history(DietHistory diet_history) {
        this.diet_history = diet_history;
    }

    public MedicalHistory getMedical_history() {
        return medical_history;
    }

    public void setMedical_history(MedicalHistory medical_history) {
        this.medical_history = medical_history;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public List<String> getMedications() {
        return medications;
    }

    public void setMedications(List<String>  medications) {
        this.medications = medications;
    }

    public Pathology getPathology() {
        return pathology;
    }

    public void setPathology(Pathology pathology) {
        this.pathology = pathology;
    }



}

public class  Demographics {

    String gender;
    int age;
    String occupation;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}

public class   Measurements {
    public Object[] getHeight() {
        return height;
    }

    public void setHeight(Object[] height) {
        this.height = height;
    }

    public Object[] getWeight() {
        return weight;
    }

    public void setWeight(Object[] weight) {
        this.weight = weight;
    }

    public Object[] getWaist() {
        return waist;
    }

    public void setWaist(Object[] waist) {
        this.waist = waist;
    }

    public Object[] getHip() {
        return hip;
    }

    public void setHip(Object[] hip) {
        this.hip = hip;
    }

    public Object[] getSbp() {
        return sbp;
    }

    public void setSbp(Object[] sbp) {
        this.sbp = sbp;
    }

    public Object[] getDbp() {
        return dbp;
    }

    public void setDbp(Object[] dbp) {
        this.dbp = dbp;
    }

    Object[] height = new Object[]{1.5, "m"};
    Object[] weight = new Object[]{92, "kg"};
    Object[] waist = new Object[]{50, "cm"};
    Object[] hip = new Object[]{90, "cm"};
    Object[] sbp = new Object[]{150, "sitting"};
    Object[] dbp = new Object[]{92, "sitting"};

   public Measurements(){
   }
    public Measurements(Object[] height, Object[] weight, Object[] waist, Object[] hip, Object[] sbp, Object[] dbp) {
        this.height = height;
        this.weight = weight;
        this.waist = waist;
        this.hip = hip;
        this.sbp = sbp;
        this.dbp = dbp;
    }
}

public class Smoking{

    int current=0;
    int ex_smoker= 1;
    int quit_within_year= 0;

    public Smoking(){

    }
    public Smoking(int current, int ex_smoker, int quit_within_year) {
        this.current = current;
        this.ex_smoker = ex_smoker;
        this.quit_within_year = quit_within_year;
    }
}

public class DietHistory {
    int fruit =1;

    public DietHistory() {
    }

    public DietHistory(int fruit, int veg) {
        this.fruit = fruit;
        this.veg = veg;
    }

    public int getFruit() {
        return fruit;
    }

    public void setFruit(int fruit) {
        this.fruit = fruit;
    }

    public int getVeg() {
        return veg;
    }

    public void setVeg(int veg) {
        this.veg = veg;
    }

    int veg= 6;

}

    public class MedicalHistory{
        public List<String> getConditions() {
            return conditions;
        }

        public void setConditions(List<String> conditions) {
            this.conditions = conditions;
        }

        //        List<Condition> conditions= Collections.emptyList();
//
//    public List<Condition> getConditions() {
//        return conditions;
//    }
//
//    public void setConditions(List<Condition> conditions) {
//        this.conditions = conditions;
//    }
        List<String> conditions = Collections.emptyList();



}
public class BSL {
    String   type="random";
    String    units= "mg/dl";
    int   value= 200;

    public BSL() {
    }

    public BSL(String type, int value) {
        this.type = type;
        this.value = value;
    }
}

public class  Cholesterol {
    public Cholesterol() {
    }

    String type= "fasting";
    String units= "mmol/l";
    double total_chol=5.2;
    int hdl= 100;
    int ldl= 240;

    public Cholesterol(String type, double total_chol, int hdl, int ldl) {
        this.type = type;
        this.total_chol = total_chol;
        this.hdl = hdl;
        this.ldl = ldl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public double getTotal_chol() {
        return total_chol;
    }

    public void setTotal_chol(double total_chol) {
        this.total_chol = total_chol;
    }

    public int getHdl() {
        return hdl;
    }

    public void setHdl(int hdl) {
        this.hdl = hdl;
    }

    public int getLdl() {
        return ldl;
    }

    public void setLdl(int ldl) {
        this.ldl = ldl;
    }
}
public class     Allergies    {}
public class Pathology{
    public BSL getBsl() {
        return bsl;
    }

    public void setBsl(BSL bsl) {
        this.bsl = bsl;
    }

    public Cholesterol getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Cholesterol cholesterol) {
        this.cholesterol = cholesterol;
    }

    BSL bsl = new BSL();
    Cholesterol cholesterol = new Cholesterol();

    public Pathology(BSL bsl, Cholesterol cholesterol) {
        this.bsl = bsl;
        this.cholesterol = cholesterol;
    }

    public Pathology() {
    }
}

public class Condition {
        String name;
        String startDate;
        String status;
        String referenceCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
}
}