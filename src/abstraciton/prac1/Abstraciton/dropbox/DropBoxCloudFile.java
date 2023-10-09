package abstraciton.prac1.Abstraciton.dropbox;

import abstraciton.prac1.Abstraciton.CloudFile;

public class DropBoxCloudFile implements CloudFile {
    private DropBoxClient dbClient;
    private DbFile dbFile;

    public DropBoxCloudFile(DropBoxClient dbClient, DbFile dbFile) {
        this.dbClient = dbClient;
        this.dbFile = dbFile;
    }


}
