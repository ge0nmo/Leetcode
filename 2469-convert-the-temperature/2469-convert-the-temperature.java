class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.8 + 32;

        double answer[] = new double[2];
        answer[0] = Kelvin;
        answer[1] = Fahrenheit;
        return answer;

    }
}