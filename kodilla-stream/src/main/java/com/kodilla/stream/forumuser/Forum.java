package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum () {
        forumUsersList.add(new ForumUser(1, "Nick", 'M',1992, 10,  11, 25));
        forumUsersList.add(new ForumUser(2, "Athena", 'F',2009, 12,  21, 5));
        forumUsersList.add(new ForumUser(3, "Edgeworth", 'M',1992, 4,  5, 0));
        forumUsersList.add(new ForumUser(4, "Maya", 'F',2000, 9,  28, 207));
        forumUsersList.add(new ForumUser(5, "Pearl", 'F',2010, 1,  15, 78));
        forumUsersList.add(new ForumUser(6, "Polly", 'M',2003, 7,  25, 0));
        forumUsersList.add(new ForumUser(7, "Trucy", 'F',2011, 4,  16, 2));
        forumUsersList.add(new ForumUser(8, "Franziska", 'F',1999, 2,  21, 58));
        forumUsersList.add(new ForumUser(9, "Gumshoe", 'M',1986, 5,  13, 0));
        forumUsersList.add(new ForumUser(10, "Butz", 'M',1993, 11,  10, 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(forumUsersList);
    }
}
