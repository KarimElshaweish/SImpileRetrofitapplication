package automation.ebtkarat.simpileretrofitapplication.Data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Antnna on 05-Feb-19.
 */

public class Data {
    @SerializedName("albumId")
    Integer albumId;
    @SerializedName("title")
    String title;
    @SerializedName("url")
    String url;
    @SerializedName("thumbnailUrl")
    String thumbnailUrl;

    public Data(Integer albumId, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
