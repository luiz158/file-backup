package fileBackup.fileAnalysis;

/**
 * Possible backup operations that can be performed. The additional description can be used for UI labels etc.
 *
 * Created by matt on 30-Jun-17.
 */
public enum FileSystemAction {
    New("New"),
    Modify("Replace"),
    Delete("Delete");

    private String description;

    FileSystemAction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
