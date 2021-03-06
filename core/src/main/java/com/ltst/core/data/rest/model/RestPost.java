package com.ltst.core.data.rest.model;

import com.ltst.core.data.response.ChildResponse;
import com.ltst.core.data.response.GroupResponse;
import com.squareup.moshi.Json;

import java.util.List;

public class RestPost {

    private long id;
    @Json(name = "activity")
    private RestChildActivity activity;
    @Json(name = "kind")
    private String kind;
    @Json(name = "child_id")
    private int childId;
    private List<RestImage> images;
    private String content;
    @Json(name = "created_at")
    private String createdAt;
    @Json(name = "children")
    private List<ChildResponse> childResponse;
    @Json(name = "group")
    GroupResponse group;

    /*for checkout report*/
    @Json(name = "child_avatar_url")
    String childAvatarUrl;
    @Json(name = "child_first_name")
    String firstName;
    @Json(name = "child_last_name")
    String lastName;


    public RestPost(int id, RestChildActivity activity, String kind, int childId,
                    List<RestImage> images, String content, String createdAt,
                    List<ChildResponse> childResponse, GroupResponse group) {
        this.id = id;
        this.activity = activity;
        this.kind = kind;
        this.childId = childId;
        this.images = images;
        this.content = content;
        this.createdAt = createdAt;
        this.childResponse = childResponse;
        this.group = group;
    }

    public String getChildAvatarUrl() {
        return childAvatarUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public GroupResponse getGroup() {
        return group;
    }

    public long getId() {
        return id;
    }

    public RestChildActivity getActivity() {
        return activity;
    }

    public String getKind() {
        return kind;
    }

    public int getChildId() {
        return childId;
    }

    public List<RestImage> getImages() {
        return images;
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public List<ChildResponse> getChildResponse() {
        return childResponse;
    }
}
