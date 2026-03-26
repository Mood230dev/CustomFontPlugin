# 📝 CustomFontPlugin

CustomFontPlugin, Minecraft sunucularındaki oyuncu sohbetlerini otomatik olarak özel bir fonta (küçük-büyük harf stili) dönüştüren hafif ve optimize edilmiş bir Spigot/Paper eklentisidir. 

Özellikle RPG, hayatta kalma ve özel konseptli sunucularda sohbet arayüzüne farklı bir hava katmak için tasarlanmıştır.

## ✨ Özellikler
* **Otomatik Font Çevirisi:** Oyuncuların yazdığı normal mesajları anında `ǫᴡᴇʀᴛʏᴜɪᴏᴘᴀѕᴅꜰɢʜᴊᴋʟᴢхᴄᴠʙɴᴍ` gibi özel karakterlere çevirir.
* **Tam Renk Kodu Desteği:** Minecraft'ın klasik renk kodlarını (`&a`, `&c`, `&l` vb.) destekler. Renk kodları bozulmadan yazının geri kalanı özel fonta dönüştürülür.
* **Sıfır Gecikme (Lag-Free):** `AsyncPlayerChatEvent` kullanılarak geliştirildiği için ana sunucu döngüsünü (main thread) yormaz, asenkron çalışır.
* **Tak-Çalıştır:** Hiçbir yapılandırma dosyasına (config) ihtiyaç duymaz, sunucuya eklendiği an çalışmaya başlar.

## ⚙️ Gereksinimler
* **Minecraft Sürümü:** 1.21.x (Spigot veya Paper)
* **Java Sürümü:** Java 21

## 🚀 Kurulum
1. GitHub üzerinden veya kendi bilgisayarınızda derlediğiniz `CustomFontPlugin-0.0.1-SNAPSHOT.jar` dosyasını alın.
2. Sunucunuzun ana dizinindeki `plugins` klasörünün içine atın.
3. Sunucunuzu başlatın veya yeniden başlatın. (Plugman gibi eklentilerle aktif edilebilir).
4. Oyuna girip sohbete bir şeyler yazın ve yeni fontunuzun tadını çıkarın!

## 💻 Kullanım Örneği
Oyuncu sohbete şunu yazdığında:
> `&aMerhaba &cDünya!`

Sohbette şu şekilde görünür (renkli olarak):
> `&aᴍᴇʀʜᴀʙᴀ &cᴅüɴʏᴀ!`

## 👨‍💻 Geliştirici
Bu eklenti **Mood230dev (Mood_23)** tarafından geliştirilmiştir.
