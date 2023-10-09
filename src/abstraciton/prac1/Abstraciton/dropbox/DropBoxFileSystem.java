package abstraciton.prac1.Abstraciton.dropbox;

import abstraciton.prac1.Abstraciton.CloudFile;
import abstraciton.prac1.Abstraciton.CloudFileSystem;

import java.util.ArrayList;
import java.util.List;

public class DropBoxFileSystem implements CloudFileSystem {
    private DropBoxClient dbClient = new DropBoxClient(...);

    @Override
    public List<CloudFile> getFiles() {
        List<DbFile> dbFiles = dbClient.getFiles();
        List<CloudFile> results = new ArrayList<>(dbFiles.size());
        for (DbFile file : dbFiles) {
            DropBoxCloudFile cf = new DropBoxCloudFile(file, dbClient);
            results.add(cf);
        }
        return results;
    }


}
