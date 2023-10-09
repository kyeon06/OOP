package abstraciton.prac1.NoAbstraciton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 추상화하지 않았을 경우
 * 클라우드와 기능이 추가가 될 경우
 * 파일을 다운로드 하거나 검색, 삭제 메소드에 if-else 구문이 계속해서 반복, 추가가 될 것이다.
 *
 * 개발 시간 증가 이유
 * - 코드 구조가 길어지고 복잡해짐
 * - 관련 코드가 여러 곳에 분산됨
 * - 결과적으로 코드 가독성과 분석 속도 저하... 코드 추가에 다른 노동 시간 증가, 실수하기 쉽고 불필요한 디버깅 시간 증가
 */
public class CloudFileManager {
    public List<FileInfo> getFileInfos(CloudId cloudId) {
        if (cloudId == CloudId.DROPBOX) {
            DropBoxClient dc = ...;
            List<DbFile> dbFiles = db.getFiles();
            List<FileInfo> result = new ArrayList<>();

            for (DbFile dbFile : dbFiles) {
                FileInfo fi = new FileInfo();
                fi.setCloudId(CloudId.DROPBOX);
                fi.setFileId(fi.getFileId());
                ...
                result.add(fi);
            }

            return result;
        } else if (cloudId == CloudId.BOX) {
            BoxService boxSvc = ...;
        }
    }

    public void download(FileInfo file, File localTarget) {
        if (file.getCloudId() == CloudId.DROPBOX) {
            DropboxClient dc = ...;
            FileOutputStream out = new FileOutputStream(localTarget);
            dc.copy(file.getFileId(), out);
            out.close();
        } else if (file.getCloudId() == CloudId.BOX) {
            BoxService boxSvc = ...;
            InputStream is = boxSvc.getInputStream(file.getFileId());
            FileOutputStream out = new FileOutputStream(localTarget);
            CopyUtil.copy(is, out);

        }
    }

    public FileInfo copy(FileInfo fileInfo, CloudId to) {
        CloudId from = fileInfo.getCloudId();

        if (to == CloudId.DROPBOX) {
            if (from == CloudId.BOX) {

            } else if (from == CloudId.NClOUD){

            }
            ...

            // 이런식으로 else-if 구문이 계속 추가가 될 것이다..(문제)
    }
}
