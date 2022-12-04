public class BmiService {
    public float calculate(float weight, float height) {

        float result = (weight / (height * height));
        return result;
    }
}
