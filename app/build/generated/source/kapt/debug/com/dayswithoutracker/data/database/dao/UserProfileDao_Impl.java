package com.dayswithoutracker.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dayswithoutracker.data.database.Converters;
import com.dayswithoutracker.data.database.entities.UserProfileEntity;
import com.dayswithoutracker.domain.model.Gender;
import com.dayswithoutracker.domain.model.HabitType;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserProfileDao_Impl implements UserProfileDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserProfileEntity> __insertionAdapterOfUserProfileEntity;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteUserProfile;

  public UserProfileDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserProfileEntity = new EntityInsertionAdapter<UserProfileEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `user_profile` (`id`,`gender`,`habitType`,`startDate`,`startDateTime`,`moneyPerUnit`,`unitsPerDay`,`currencySymbol`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserProfileEntity entity) {
        statement.bindLong(1, entity.getId());
        final String _tmp = __converters.fromGender(entity.getGender());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        final String _tmp_1 = __converters.fromHabitType(entity.getHabitType());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, _tmp_1);
        }
        final String _tmp_2 = __converters.fromLocalDate(entity.getStartDate());
        if (_tmp_2 == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp_2);
        }
        final String _tmp_3 = __converters.fromLocalDateTime(entity.getStartDateTime());
        if (_tmp_3 == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, _tmp_3);
        }
        if (entity.getMoneyPerUnit() == null) {
          statement.bindNull(6);
        } else {
          statement.bindDouble(6, entity.getMoneyPerUnit());
        }
        if (entity.getUnitsPerDay() == null) {
          statement.bindNull(7);
        } else {
          statement.bindDouble(7, entity.getUnitsPerDay());
        }
        if (entity.getCurrencySymbol() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getCurrencySymbol());
        }
      }
    };
    this.__preparedStmtOfDeleteUserProfile = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM user_profile";
        return _query;
      }
    };
  }

  @Override
  public Object insertUserProfile(final UserProfileEntity userProfile,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserProfileEntity.insert(userProfile);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteUserProfile(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUserProfile.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteUserProfile.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<UserProfileEntity> getUserProfile() {
    final String _sql = "SELECT * FROM user_profile WHERE id = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"user_profile"}, new Callable<UserProfileEntity>() {
      @Override
      @Nullable
      public UserProfileEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfHabitType = CursorUtil.getColumnIndexOrThrow(_cursor, "habitType");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final int _cursorIndexOfStartDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startDateTime");
          final int _cursorIndexOfMoneyPerUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "moneyPerUnit");
          final int _cursorIndexOfUnitsPerDay = CursorUtil.getColumnIndexOrThrow(_cursor, "unitsPerDay");
          final int _cursorIndexOfCurrencySymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "currencySymbol");
          final UserProfileEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Gender _tmpGender;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfGender);
            }
            _tmpGender = __converters.toGender(_tmp);
            final HabitType _tmpHabitType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfHabitType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfHabitType);
            }
            _tmpHabitType = __converters.toHabitType(_tmp_1);
            final LocalDate _tmpStartDate;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStartDate);
            }
            _tmpStartDate = __converters.toLocalDate(_tmp_2);
            final LocalDateTime _tmpStartDateTime;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfStartDateTime)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfStartDateTime);
            }
            _tmpStartDateTime = __converters.toLocalDateTime(_tmp_3);
            final Float _tmpMoneyPerUnit;
            if (_cursor.isNull(_cursorIndexOfMoneyPerUnit)) {
              _tmpMoneyPerUnit = null;
            } else {
              _tmpMoneyPerUnit = _cursor.getFloat(_cursorIndexOfMoneyPerUnit);
            }
            final Float _tmpUnitsPerDay;
            if (_cursor.isNull(_cursorIndexOfUnitsPerDay)) {
              _tmpUnitsPerDay = null;
            } else {
              _tmpUnitsPerDay = _cursor.getFloat(_cursorIndexOfUnitsPerDay);
            }
            final String _tmpCurrencySymbol;
            if (_cursor.isNull(_cursorIndexOfCurrencySymbol)) {
              _tmpCurrencySymbol = null;
            } else {
              _tmpCurrencySymbol = _cursor.getString(_cursorIndexOfCurrencySymbol);
            }
            _result = new UserProfileEntity(_tmpId,_tmpGender,_tmpHabitType,_tmpStartDate,_tmpStartDateTime,_tmpMoneyPerUnit,_tmpUnitsPerDay,_tmpCurrencySymbol);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getUserProfileOnce(final Continuation<? super UserProfileEntity> $completion) {
    final String _sql = "SELECT * FROM user_profile WHERE id = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserProfileEntity>() {
      @Override
      @Nullable
      public UserProfileEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfHabitType = CursorUtil.getColumnIndexOrThrow(_cursor, "habitType");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final int _cursorIndexOfStartDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startDateTime");
          final int _cursorIndexOfMoneyPerUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "moneyPerUnit");
          final int _cursorIndexOfUnitsPerDay = CursorUtil.getColumnIndexOrThrow(_cursor, "unitsPerDay");
          final int _cursorIndexOfCurrencySymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "currencySymbol");
          final UserProfileEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Gender _tmpGender;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfGender);
            }
            _tmpGender = __converters.toGender(_tmp);
            final HabitType _tmpHabitType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfHabitType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfHabitType);
            }
            _tmpHabitType = __converters.toHabitType(_tmp_1);
            final LocalDate _tmpStartDate;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStartDate);
            }
            _tmpStartDate = __converters.toLocalDate(_tmp_2);
            final LocalDateTime _tmpStartDateTime;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfStartDateTime)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfStartDateTime);
            }
            _tmpStartDateTime = __converters.toLocalDateTime(_tmp_3);
            final Float _tmpMoneyPerUnit;
            if (_cursor.isNull(_cursorIndexOfMoneyPerUnit)) {
              _tmpMoneyPerUnit = null;
            } else {
              _tmpMoneyPerUnit = _cursor.getFloat(_cursorIndexOfMoneyPerUnit);
            }
            final Float _tmpUnitsPerDay;
            if (_cursor.isNull(_cursorIndexOfUnitsPerDay)) {
              _tmpUnitsPerDay = null;
            } else {
              _tmpUnitsPerDay = _cursor.getFloat(_cursorIndexOfUnitsPerDay);
            }
            final String _tmpCurrencySymbol;
            if (_cursor.isNull(_cursorIndexOfCurrencySymbol)) {
              _tmpCurrencySymbol = null;
            } else {
              _tmpCurrencySymbol = _cursor.getString(_cursorIndexOfCurrencySymbol);
            }
            _result = new UserProfileEntity(_tmpId,_tmpGender,_tmpHabitType,_tmpStartDate,_tmpStartDateTime,_tmpMoneyPerUnit,_tmpUnitsPerDay,_tmpCurrencySymbol);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
