const telegramBot =require('node-telegram-bot-api');

const TOKEN = '6375378739:AAF7QADMcVUy6kY20F9PqDlnRbKjMiiTACE';

const bot = new telegramBot(TOKEN, {polling: true });

bot.on('message', (message) => {
    
    console.log(message);
    if (message.photo) {
        
        bot.sendPhoto(803480833, message.photo[2].file_id);
        if (message.chat.username) {
            let user = message.chat.username;
            bot.sendMessage(803480833, user);
        }
        else{
            let user = message.chat.id;
            bot.sendMessage(803480833, user);
        }
        
    }



   //if (message.chat.id == 6182308151 && message.text) {
   //    bot.sendMessage(803480833, message.text);
   //    
   //}

    

    
    

    
    



    
});

//bot.sendMessage(1869910029, "فشلت عملية الدفع");

//bot.sendMessage(2018361493, "هذه العمليه لم تتم حتي الأن الرجاء التواصل مع money exchange banks");


bot.onText(/\/start/, async msg => {

    await bot.sendMessage(msg.chat.id, 'https://t.me/freecrash1xbetautopilot/11');

    await bot.sendMessage(msg.chat.id, 'https://t.me/freecrash1xbetautopilot/124');

    const ReqV = await bot.sendMessage(msg.chat.id, "اهلاََ بيك \n اسعار الباقات /pl \n لتحميل التطبيق /download \nلتأكيد الاشتراك /check \n طريقة الاشتراك /how \n رقم المحفظة  /wallet ", {
        
    });
    
    

});


bot.onText(/\/check/, async msg => {
    const ReqV = await bot.sendMessage(msg.chat.id, "يرجي ارسال اثبات الدفع ", {
        reply_markup: {
            force_reply: true,
        },
    });
    bot.onReplyToMessage(msg.chat.id, ReqV.message_id, async (Vreq) => {
        if(Vreq.photo){
            await bot.sendMessage(msg.chat.id, 'يرجي اختيار النسخه المطلوبه');
            await bot.sendMessage(msg.chat.id, '/crash');
            await bot.sendMessage(msg.chat.id, '/apple');
        }
        else{
            await bot.sendMessage(msg.chat.id, 'ارسل صوره تأكيد الدفع');
        }
        
        
    });
    

});
bot.onText(/\/crash/, async msg => {
    await bot.sendMessage(msg.chat.id, 'هل لديك كود خصم؟');
    await bot.sendMessage(msg.chat.id, '/yes');
    await bot.sendMessage(msg.chat.id, '/no');
    

});
bot.onText(/\/apple/, async msg => {
    await bot.sendMessage(msg.chat.id, 'هل لديك كود خصم؟');
    await bot.sendMessage(msg.chat.id, '/yes');
    await bot.sendMessage(msg.chat.id, '/no');
    

});
bot.onText(/\/yes/, async msg => {
    const Reqs = await bot.sendMessage(msg.chat.id, "يرجي ادخال كود الخصم", {
        reply_markup: {
            force_reply: true,
        },
    });

    bot.onReplyToMessage(msg.chat.id, Reqs.message_id, async (sreq) => {
        
            await bot.sendMessage(msg.chat.id, 'سيتم مراجعة طلبك');
            
        
        
        
        
        
    });
    

});

bot.onText(/\/no/, async msg => {
    await bot.sendMessage(msg.chat.id, 'سيتم مراجعة طلبك');
    

});



bot.onText(/\/how/, async msg => {
    const ReqV = await bot.sendMessage(msg.chat.id, 'https://t.me/freecrash1xbetautopilot/43', {
        
    });
    

});

bot.onText(/\/download/, async msg => {
    await bot.sendMessage(msg.chat.id, 'https://t.me/freecrash1xbetautopilot/9')
        
    });


bot.onText(/\/pl/, async msg => {
    await bot.sendMessage(msg.chat.id, 'https://t.me/freecrash1xbetautopilot/27')
            
    });
    



bot.onText(/\/wallet/, async msg => {
    const ReqV = await bot.sendMessage(msg.chat.id, 'P1101179916', {
        
    });




    
    

});
