class Time {
    private int hour;
    private int minute;
    private int second;
    
    // Parameterized constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // Member function to sum two Time objects
    public static Time timeSum(Time t1, Time t2) {
        int hour = t1.hour + t2.hour;
        int minute = t1.minute + t2.minute;
        int second = t1.second + t2.second;
        
        // Handle carrying over
        if (second >= 60) {
            second -= 60;
            minute++;
        }
        if (minute >= 60) {
            minute -= 60;
            hour++;
        }
        
        return new Time(hour, minute, second);
    }
}