public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int maxITNs;

    public StudyProgramme(String name, String description, int numberOfSemesters, int maxITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNs = maxITNs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getMaxITNs() {
        return maxITNs;
    }
}

