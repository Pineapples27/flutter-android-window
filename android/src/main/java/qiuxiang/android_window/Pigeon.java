// Autogenerated from Pigeon (v21.2.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package qiuxiang.android_window;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class Pigeon {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) 
    {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
        "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  @NonNull
  protected static FlutterError createConnectionError(@NonNull String channelName) {
    return new FlutterError("channel-error",  "Unable to establish connection on channel: " + channelName + ".", "");
  }

  private static class PigeonCodec extends StandardMessageCodec {
    public static final PigeonCodec INSTANCE = new PigeonCodec();

    private PigeonCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      {
        super.writeValue(stream, value);
      }
    }
  }


  /** Asynchronous error handling return type for non-nullable API method returns. */
  public interface Result<T> {
    /** Success case callback method for handling returns. */
    void success(@NonNull T result);

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }
  /** Asynchronous error handling return type for nullable API method returns. */
  public interface NullableResult<T> {
    /** Success case callback method for handling returns. */
    void success(@Nullable T result);

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }
  /** Asynchronous error handling return type for void API method returns. */
  public interface VoidResult {
    /** Success case callback method for handling returns. */
    void success();

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }
  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface MainApi {

    void canDrawOverlays(@NonNull Result<Boolean> result);

    void requestPermission(@NonNull VoidResult result);

    void isRunning(@NonNull Result<Boolean> result);

    void post(@NonNull Map<Object, Object> message, @NonNull Result<Map<Object, Object>> result);

    void open(@NonNull String entry, @NonNull Long width, @NonNull Long height, @NonNull Long x, @NonNull Long y, @NonNull Boolean focusable);

    void close();

    /** The codec used by MainApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }
    /**Sets up an instance of `MainApi` to handle messages through the `binaryMessenger`. */
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable MainApi api) {
      setUp(binaryMessenger, "", api);
    }
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String messageChannelSuffix, @Nullable MainApi api) {
      messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.MainApi.canDrawOverlays" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                Result<Boolean> resultCallback =
                    new Result<Boolean>() {
                      public void success(Boolean result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.canDrawOverlays(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.MainApi.requestPermission" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.requestPermission(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.MainApi.isRunning" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                Result<Boolean> resultCallback =
                    new Result<Boolean>() {
                      public void success(Boolean result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.isRunning(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.MainApi.post" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Map<Object, Object> messageArg = (Map<Object, Object>) args.get(0);
                Result<Map<Object, Object>> resultCallback =
                    new Result<Map<Object, Object>>() {
                      public void success(Map<Object, Object> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.post(messageArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.MainApi.open" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String entryArg = (String) args.get(0);
                Number widthArg = (Number) args.get(1);
                Number heightArg = (Number) args.get(2);
                Number xArg = (Number) args.get(3);
                Number yArg = (Number) args.get(4);
                Boolean focusableArg = (Boolean) args.get(5);
                try {
                  api.open(entryArg, (widthArg == null) ? null : widthArg.longValue(), (heightArg == null) ? null : heightArg.longValue(), (xArg == null) ? null : xArg.longValue(), (yArg == null) ? null : yArg.longValue(), focusableArg);
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.MainApi.close" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  api.close();
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface AndroidWindowApi {

    void post(@NonNull Map<Object, Object> message, @NonNull Result<Map<Object, Object>> result);

    void resize(@NonNull Long width, @NonNull Long height);

    void setPosition(@NonNull Long x, @NonNull Long y);

    void dragStart();

    void dragEnd();

    void close();

    void launchApp();

    /** The codec used by AndroidWindowApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }
    /**Sets up an instance of `AndroidWindowApi` to handle messages through the `binaryMessenger`. */
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable AndroidWindowApi api) {
      setUp(binaryMessenger, "", api);
    }
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String messageChannelSuffix, @Nullable AndroidWindowApi api) {
      messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.post" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Map<Object, Object> messageArg = (Map<Object, Object>) args.get(0);
                Result<Map<Object, Object>> resultCallback =
                    new Result<Map<Object, Object>>() {
                      public void success(Map<Object, Object> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.post(messageArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.resize" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number widthArg = (Number) args.get(0);
                Number heightArg = (Number) args.get(1);
                try {
                  api.resize((widthArg == null) ? null : widthArg.longValue(), (heightArg == null) ? null : heightArg.longValue());
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.setPosition" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number xArg = (Number) args.get(0);
                Number yArg = (Number) args.get(1);
                try {
                  api.setPosition((xArg == null) ? null : xArg.longValue(), (yArg == null) ? null : yArg.longValue());
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.dragStart" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  api.dragStart();
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.dragEnd" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  api.dragEnd();
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.close" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  api.close();
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.android_window.AndroidWindowApi.launchApp" + messageChannelSuffix, getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  api.launchApp();
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  /** Generated class from Pigeon that represents Flutter messages that can be called from Java. */
  public static class AndroidWindowHandler {
    private final @NonNull BinaryMessenger binaryMessenger;
    private final String messageChannelSuffix;

    public AndroidWindowHandler(@NonNull BinaryMessenger argBinaryMessenger) {
      this(argBinaryMessenger, "");
    }
    public AndroidWindowHandler(@NonNull BinaryMessenger argBinaryMessenger, @NonNull String messageChannelSuffix) {
      this.binaryMessenger = argBinaryMessenger;
      this.messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
    }

    /**
     * Public interface for sending reply.
     * The codec used by AndroidWindowHandler.
     */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }
    public void handler(@NonNull Map<Object, Object> messageArg, @NonNull Result<Map<Object, Object>> result) {
      final String channelName = "dev.flutter.pigeon.android_window.AndroidWindowHandler.handler" + messageChannelSuffix;
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, channelName, getCodec());
      channel.send(
          new ArrayList<>(Collections.singletonList(messageArg)),
          channelReply -> {
            if (channelReply instanceof List) {
              List<Object> listReply = (List<Object>) channelReply;
              if (listReply.size() > 1) {
                result.error(new FlutterError((String) listReply.get(0), (String) listReply.get(1), listReply.get(2)));
              } else if (listReply.get(0) == null) {
                result.error(new FlutterError("null-error", "Flutter api returned null value for non-null return value.", ""));
              } else {
                @SuppressWarnings("ConstantConditions")
                Map<Object, Object> output = (Map<Object, Object>) listReply.get(0);
                result.success(output);
              }
            }  else {
              result.error(createConnectionError(channelName));
            } 
          });
    }
  }
  /** Generated class from Pigeon that represents Flutter messages that can be called from Java. */
  public static class MainHandler {
    private final @NonNull BinaryMessenger binaryMessenger;
    private final String messageChannelSuffix;

    public MainHandler(@NonNull BinaryMessenger argBinaryMessenger) {
      this(argBinaryMessenger, "");
    }
    public MainHandler(@NonNull BinaryMessenger argBinaryMessenger, @NonNull String messageChannelSuffix) {
      this.binaryMessenger = argBinaryMessenger;
      this.messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
    }

    /**
     * Public interface for sending reply.
     * The codec used by MainHandler.
     */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }
    public void handler(@NonNull Map<Object, Object> messageArg, @NonNull Result<Map<Object, Object>> result) {
      final String channelName = "dev.flutter.pigeon.android_window.MainHandler.handler" + messageChannelSuffix;
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, channelName, getCodec());
      channel.send(
          new ArrayList<>(Collections.singletonList(messageArg)),
          channelReply -> {
            if (channelReply instanceof List) {
              List<Object> listReply = (List<Object>) channelReply;
              if (listReply.size() > 1) {
                result.error(new FlutterError((String) listReply.get(0), (String) listReply.get(1), listReply.get(2)));
              } else if (listReply.get(0) == null) {
                result.error(new FlutterError("null-error", "Flutter api returned null value for non-null return value.", ""));
              } else {
                @SuppressWarnings("ConstantConditions")
                Map<Object, Object> output = (Map<Object, Object>) listReply.get(0);
                result.success(output);
              }
            }  else {
              result.error(createConnectionError(channelName));
            } 
          });
    }
  }
}
