package com.mobileapp.beyerage.dto.kakaoObject;
import java.util.List;

public class ResultSearchKeyword {
    private PlaceMeta metadata;
    private List<Place> documents;

    public PlaceMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(PlaceMeta metadata) {
        this.metadata = metadata;
    }

    public List<Place> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Place> documents) {
        this.documents = documents;
    }

}

