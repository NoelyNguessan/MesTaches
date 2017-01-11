package noely.com.todolist.db.db;

import android.provider.BaseColumns;

/**
 * Created by Sabine on 10/01/2017.
 */
public class TaskContract {

    public static final String DB_NAME= "com.noely.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
