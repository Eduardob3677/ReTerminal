# ReTerminal
**ReTerminal** is a sleek, Material 3-inspired terminal emulator designed as a modern alternative to the legacy [Jackpal Terminal](https://github.com/jackpal/Android-Terminal-Emulator). Built on [Termux's](https://github.com/termux/termux-app) robust TerminalView

Download the latest APK from the [Releases Section](https://github.com/RohitKushvaha01/ReTerminal/releases/latest).

# Features
- [x] Basic Terminal
- [x] Virtual Keys
- [x] Multiple Sessions
- [x] Alpine Linux support

# Screenshots
<div>
  <img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/01.png" width="32%" />
  <img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/02.jpg" width="32%" />
  <img src="/fastlane/metadata/android/en-US/images/phoneScreenshots/03.jpg" width="32%" />
</div>

## Community
> [!TIP]
Join the reTerminal community to stay updated and engage with other users:
- [Telegram](https://t.me/reTerminal)


# FAQ

### **Q: Why do I get a "Permission Denied" error when trying to execute a binary or script?**
**A:** This happens because ReTerminal runs on the latest Android API, which enforces **W^X restrictions**. Since files in `$PREFIX` or regular storage directories can't be executed directly, you need to use one of the following workarounds:

---

### **Option 1: Use the Dynamic Linker (for Binaries)**
If you're trying to run a binary (not a script), you can use the dynamic linker to execute it:

```bash
$LINKER /absolute/path/to/binary
```

✅ **Note:** This method won't work for **statically linked binaries** (binaries without external dependencies).

---

### **Option 2: Use `sh` for Scripts**
If you're trying to execute a shell script, simply use `sh` to run it:

```bash
sh /path/to/script
```

This bypasses the need for execute permissions since the script is interpreted by the shell.

---

### **Option 3: Use Shizuku for Full Shell Access (Recommended)**
If you have **Shizuku** installed, you can gain shell access to `/data/local/tmp`, which has executable permissions. This is the easiest way to run binaries without restrictions.


## Found this app useful? :heart:
Support it by giving a star :star: <br>
Also, **__[follow](https://github.com/Rohitkushvaha01)__** me for my next creations!

