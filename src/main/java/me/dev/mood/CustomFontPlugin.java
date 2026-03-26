package me.dev.mood;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class CustomFontPlugin extends JavaPlugin implements Listener {

    private final Map<Character, Character> fontMap = new HashMap<>();

    @Override
    public void onEnable() {
        setupFontMap();
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("Ozel Font ve Renk Eklentisi Aktif!");
    }

    private void setupFontMap() {
        // Normal karakterler -> Minecraft Smal Font
        String normal = "1234567890qwertyuıopğüasdfghjklşizxcvbnmöçQWERTYUIOPĞÜASDFGHJKLŞİZXCVBNMÖÇ";
        String custom = "₁₂₃₄₅₆₇₈₉₀ǫᴡᴇʀᴛʏᴜıᴏᴘğüᴀѕᴅꜰɢʜᴊᴋʟşɪᴢхᴄᴠʙɴᴍöçǫᴡᴇʀᴛʏᴜɪᴏᴘğüᴀѕᴅꜰɢʜᴊᴋʟşɪᴢхᴄᴠʙɴᴍöç";

        for (int i = 0; i < normal.length(); i++) {
            fontMap.put(normal.charAt(i), custom.charAt(i));
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent event) {
        // 1. Önce & işaretli renk kodlarını Minecraft'ın anladığı renklere (§) çeviriyoruz
        String coloredMessage = ChatColor.translateAlternateColorCodes('&', event.getMessage());
        
        StringBuilder newMessage = new StringBuilder();

        // 2. Mesajı harf harf kontrol ediyoruz
        for (int i = 0; i < coloredMessage.length(); i++) {
            char c = coloredMessage.charAt(i);

            // Eğer karakter bir Minecraft renk kodu belirteciyse (§) ve sonrasında bir harf/sayı varsa
            if (c == '§' && i + 1 < coloredMessage.length()) {
                // Renk sembolünü ve onu takip eden harfi değiştirmeden bırak
                newMessage.append(c);
                newMessage.append(coloredMessage.charAt(i + 1));
                i++; // Renk harfini (örn: 'a') atlamak için i'yi bir arttır
            } else {
                // Renk kodu değilse normal karakteri özel fontla değiştir
                newMessage.append(fontMap.getOrDefault(c, c));
            }
        }

        // 3. Yeni mesajı oyuncunun sohbetine yansıt
        event.setMessage(newMessage.toString());
    }
}