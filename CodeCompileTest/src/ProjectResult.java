public class ProjectResult {

    private java.lang.String status;
    private java.lang.String data;

    public ProjectResult() {
    }

    public ProjectResult(java.lang.String status, java.lang.String data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ProjectResult{" +
                "status='" + status + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}