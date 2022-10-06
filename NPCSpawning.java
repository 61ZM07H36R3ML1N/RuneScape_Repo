/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.utils;

import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils.EntityDirection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class NPCSpawning {

    /**
     * Contains the custom npc spawning
     */
    public static void spawnNPCS() {
          World.spawnFacingNPC(882, new WorldTile(3044,4978, 1), 0, true, EntityDirection.SOUTH);
       
        World.spawnFacingNPC(6537, new WorldTile(3090, 3494, 0), 0, true, EntityDirection.WEST);
        World.spawnNPC(9085, new WorldTile(1736, 5312, 1), -1, true, true);
        World.spawnFacingNPC(2253, new WorldTile(3160, 3460, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(11660, new WorldTile(3159, 3467, 0), 0, true, EntityDirection.NORTH);
        World.spawnNPC(1152, new WorldTile(3561, 3314, 0), -1, false, false);	//	frosts

        World.spawnFacingNPC(2208, new WorldTile(2892, 2728, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(14237, new WorldTile(3171, 3466, 0), 0, true, EntityDirection.NORTH);

        //Edgeville.
        World.spawnFacingNPC(456, new WorldTile(3094, 3505, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(741, new WorldTile(3094, 3479, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(11294, new WorldTile(3090, 3504, 0), 0, true, EntityDirection.SOUTH);
        World.spawnNPC(14012, new WorldTile(3085, 3486, 0), -1, false, false);	//	frosts
        World.spawnNPC(456, new WorldTile(3171, 3460, 0), -1, false, false);	//	frosts

        World.spawnNPC(1598, new WorldTile(2446, 4434, 0), -1, true, true);
        /**
         * GE NPCS
         */
        World.spawnFacingNPC(1419, new WorldTile(3179, 3479, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(3418, new WorldTile(3179, 3478, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(1419, new WorldTile(3180, 3477, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2718, new WorldTile(3181, 3477, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2241, new WorldTile(3182, 3478, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(3418, new WorldTile(3182, 3479, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(2593, new WorldTile(3181, 3480, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(3418, new WorldTile(3180, 3480, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(1419, new WorldTile(3148, 3477, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2718, new WorldTile(3149, 3477, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2241, new WorldTile(3150, 3478, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(3418, new WorldTile(3150, 3479, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(2593, new WorldTile(3149, 3480, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(3418, new WorldTile(3148, 3480, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(1419, new WorldTile(3147, 3479, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(3418, new WorldTile(3147, 3478, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(1419, new WorldTile(3148, 3503, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2718, new WorldTile(3149, 3503, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2241, new WorldTile(3150, 3404, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(3418, new WorldTile(3150, 3405, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(2593, new WorldTile(3149, 3506, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(3418, new WorldTile(3148, 3506, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(1419, new WorldTile(3147, 3505, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(3418, new WorldTile(3147, 3504, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(1419, new WorldTile(3180, 3503, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2718, new WorldTile(3181, 3503, 0), 0, true, EntityDirection.SOUTH);
        World.spawnFacingNPC(2241, new WorldTile(3182, 3504, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(3418, new WorldTile(3182, 3505, 0), 0, true, EntityDirection.EAST);
        World.spawnFacingNPC(2593, new WorldTile(3181, 3506, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(3418, new WorldTile(3180, 3506, 0), 0, true, EntityDirection.NORTH);
        World.spawnFacingNPC(1419, new WorldTile(3179, 3505, 0), 0, true, EntityDirection.WEST);
        World.spawnFacingNPC(3418, new WorldTile(3179, 3504, 0), 0, true, EntityDirection.WEST);

        World.spawnNPC(8850, new WorldTile(3680, 4944, 0), -1, true, true);	//	frosts
        World.spawnNPC(1821, new WorldTile(2484, 3488, 1), -1, false, false);

        /**
         * NPCS
         *//* --------------------- Frost Dragons dungeon --------------------- */

        World.spawnNPC(51, new WorldTile(1311, 4520, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1312, 4529, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1302, 4530, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1320, 4533, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1329, 4529, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1333, 4521, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1325, 4519, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1318, 4518, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1312, 4499, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1320, 4496, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1323, 4495, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1318, 4490, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1312, 4490, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1305, 4489, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1299, 4488, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1291, 4488, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1293, 4494, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1301, 4496, 0), -1, true, true);	//	frosts
        World.spawnNPC(51, new WorldTile(1309, 4497, 0), -1, true, true);	//	frosts
        //Avalani
        World.spawnNPC(13823, new WorldTile(2718, 5210, 3), -1, true, true);
        World.spawnNPC(13824, new WorldTile(2723, 5194, 3), -1, true, true);
        World.spawnNPC(13827, new WorldTile(2701, 5201, 3), -1, true, true);
        World.spawnNPC(7939, new WorldTile(2445, 4956, 0), -1, true, true);
        /*Slayer Tower*/
        /*Crawling Hands*/
        World.spawnNPC(1648, new WorldTile(3423, 3542, 0), -1, true, true);
        World.spawnNPC(1650, new WorldTile(3420, 3546, 0), -1, true, true);
        World.spawnNPC(1649, new WorldTile(3421, 3541, 0), -1, true, true);
        World.spawnNPC(1653, new WorldTile(3411, 3549, 0), -1, true, true);
        World.spawnNPC(1655, new WorldTile(3427, 3549, 0), -1, true, true);
        World.spawnNPC(1651, new WorldTile(3426, 3555, 0), -1, true, true);
        World.spawnNPC(1652, new WorldTile(3423, 3559, 0), -1, true, true);
        World.spawnNPC(1657, new WorldTile(3418, 3556, 0), -1, true, true);
        World.spawnNPC(1655, new WorldTile(3413, 3558, 0), -1, true, true);
        World.spawnNPC(1648, new WorldTile(3413, 3564, 0), -1, true, true);
        World.spawnNPC(1650, new WorldTile(3414, 3574, 0), -1, true, true);
        World.spawnNPC(1650, new WorldTile(3415, 3572, 0), -1, true, true);
        World.spawnNPC(1657, new WorldTile(3422, 3574, 0), -1, true, true);
        World.spawnNPC(1657, new WorldTile(3418, 3571, 0), -1, true, true);
        World.spawnNPC(1657, new WorldTile(3415, 3559, 0), -1, true, true);
        /*Banshees*/
        World.spawnNPC(1612, new WorldTile(3446, 3537, 0), -1, true, true);
        World.spawnNPC(1612, new WorldTile(3440, 3538, 0), -1, true, true);
        World.spawnNPC(1612, new WorldTile(3433, 3551, 0), -1, true, true);
        World.spawnNPC(1612, new WorldTile(3438, 3561, 0), -1, true, true);
        World.spawnNPC(1612, new WorldTile(3446, 3562, 0), -1, true, true);
        World.spawnNPC(1612, new WorldTile(3439, 3572, 0), -1, true, true);
        /*Infernall Mages*/
        World.spawnNPC(1643, new WorldTile(3447, 3571, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3443, 3574, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3440, 3568, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3434, 3571, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3440, 3557, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3435, 3559, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3438, 3563, 1), -1, true, true);
        World.spawnNPC(1643, new WorldTile(3433, 3562, 1), -1, true, true);
        /*BloodVelds*/
        World.spawnNPC(1618, new WorldTile(3422, 3557, 1), -1, true, true);
        World.spawnNPC(1618, new WorldTile(3425, 3566, 1), -1, true, true);
        World.spawnNPC(1618, new WorldTile(3418, 3565, 1), -1, true, true);
        World.spawnNPC(1618, new WorldTile(3412, 3560, 1), -1, true, true);
        World.spawnNPC(1618, new WorldTile(3409, 3572, 1), -1, true, true);
        World.spawnNPC(1618, new WorldTile(3413, 3573, 1), -1, true, true);
        /*Aberrant Spectre*/
        World.spawnNPC(1604, new WorldTile(3410, 3535, 1), -1, true, true);
        World.spawnNPC(1607, new WorldTile(3429, 3539, 1), -1, true, true);
        World.spawnNPC(1604, new WorldTile(3423, 3541, 1), -1, true, true);
        World.spawnNPC(1605, new WorldTile(3417, 3545, 1), -1, true, true);
        World.spawnNPC(1605, new WorldTile(3412, 3549, 1), -1, true, true);
        World.spawnNPC(1605, new WorldTile(3442, 3545, 1), -1, true, true);
        World.spawnNPC(1607, new WorldTile(3434, 3550, 1), -1, true, true);
        World.spawnNPC(1604, new WorldTile(3427, 3551, 1), -1, true, true);
        /*Gargoyles*/
        World.spawnNPC(1610, new WorldTile(3434, 3550, 2), -1, true, true);
        World.spawnNPC(1610, new WorldTile(3442, 3547, 2), -1, true, true);
        World.spawnNPC(1610, new WorldTile(3448, 3537, 2), -1, true, true);
        World.spawnNPC(1610, new WorldTile(3441, 3540, 2), -1, true, true);
        World.spawnNPC(1610, new WorldTile(3435, 3539, 2), -1, true, true);
        /*Nechreyal*/
        World.spawnNPC(1613, new WorldTile(3447, 3573, 2), -1, true, true);
        World.spawnNPC(1613, new WorldTile(3441, 3571, 2), -1, true, true);
        World.spawnNPC(1613, new WorldTile(3438, 3566, 2), -1, true, true);
        World.spawnNPC(1613, new WorldTile(3434, 3572, 2), -1, true, true);
        World.spawnNPC(1613, new WorldTile(3436, 3559, 2), -1, true, true);
        World.spawnNPC(1613, new WorldTile(3445, 3561, 2), -1, true, true);
        /*Abby Demons*/
        World.spawnNPC(1615, new WorldTile(3411, 3570, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3410, 3576, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3427, 3565, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3427, 3572, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3421, 3571, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3417, 3566, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3413, 3562, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3417, 3558, 2), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3415, 3551, 2), -1, true, true);
        /*Dark Beast*/
        World.spawnNPC(2783, new WorldTile(3411, 3571, 2), -1, true, true);
        World.spawnNPC(2783, new WorldTile(3420, 3566, 2), -1, true, true);
        World.spawnNPC(2783, new WorldTile(3415, 3558, 2), -1, true, true);

        /*IceFiends*/
        World.spawnNPC(3406, new WorldTile(2721, 10214, 0), -1, true, true);
        World.spawnNPC(3406, new WorldTile(2715, 10219, 0), -1, true, true);
        World.spawnNPC(3406, new WorldTile(2730, 10205, 0), -1, true, true);
        World.spawnNPC(3406, new WorldTile(2712, 10205, 0), -1, true, true);

        World.spawnNPC(14923, new WorldTile(5887, 4703, 0), -2, true, true);
        World.spawnNPC(2593, new WorldTile(5889, 4702, 0), -3, true, true);
        World.spawnNPC(2593, new WorldTile(5886, 4701, 0), -4, true, true);
        /*Hunter*/
        /*Chinchompa Carnivorus*/
        World.spawnNPC(5080, new WorldTile(2574, 2906, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2576, 2903, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2574, 2908, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2572, 2908, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2571, 2901, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2572, 2909, 0), -1, true, true);

        /*Wagtails*/
        World.spawnNPC(5072, new WorldTile(2595, 2911, 0), -1, true, true);
        World.spawnNPC(5072, new WorldTile(2597, 2912, 0), -1, true, true);
        World.spawnNPC(5072, new WorldTile(2593, 2914, 0), -1, true, true);

        /*Swifts*/
        World.spawnNPC(5073, new WorldTile(2607, 2925, 0), -1, true, true);
        World.spawnNPC(5073, new WorldTile(2602, 2918, 0), -1, true, true);
        World.spawnNPC(5073, new WorldTile(2609, 2920, 0), -1, true, true);

        /*Warbler*/
        World.spawnNPC(5075, new WorldTile(2592, 2887, 0), -1, true, true);
        World.spawnNPC(5075, new WorldTile(2594, 2883, 0), -1, true, true);
        World.spawnNPC(5075, new WorldTile(2597, 2887, 0), -1, true, true);

        /*Longtail*/
        World.spawnNPC(5076, new WorldTile(2604, 2896, 0), -1, true, true);
        World.spawnNPC(5076, new WorldTile(2607, 2893, 0), -1, true, true);

        World.spawnNPC(7133, new WorldTile(3100, 5537, 0), -1, true, true);
        World.spawnNPC(659, new WorldTile(5882, 4712, 0), -1, true, true);
        World.spawnNPC(2745, new WorldTile(2405, 5085, 0), -1, true, true);
        World.spawnNPC(14078, new WorldTile(5892, 4710, 0), -1, true, true);
        World.spawnNPC(1158, new WorldTile(3484, 9493, 0), -1, true, true);
        //World.spawnNPC(14057, new WorldTile(3164, 3479, 0), -1, true, true);

        /*Jadinko's*/
        World.spawnNPC(13816, new WorldTile(3059, 9246, 0), -1, true, true);
        World.spawnNPC(13816, new WorldTile(3044, 9234, 0), -1, true, true);
        World.spawnNPC(13816, new WorldTile(3028, 9235, 0), -1, true, true);
        World.spawnNPC(13816, new WorldTile(3033, 9237, 0), -1, true, true);
        World.spawnNPC(13816, new WorldTile(3039, 9235, 0), -1, true, true);
        World.spawnNPC(13816, new WorldTile(3045, 9234, 0), -1, true, true);
        World.spawnNPC(13816, new WorldTile(3026, 9232, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3039, 9244, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3022, 9257, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3015, 9260, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3039, 9244, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3046, 9270, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3043, 9260, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3043, 9260, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3063, 9236, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3056, 9250, 0), -1, true, true);

        World.spawnNPC(13818, new WorldTile(3019, 9255, 0), -1, true, true);
        World.spawnNPC(13818, new WorldTile(3046, 9265, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3044, 9229, 0), -1, true, true);
        World.spawnNPC(13819, new WorldTile(3059, 9242, 0), -1, true, true);
        /*Mutated Jadinko's*/
        /*Babies*/
        World.spawnNPC(13820, new WorldTile(3060, 9238, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3060, 9247, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3036, 9231, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3030, 9236, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3020, 9234, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3040, 9262, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3045, 9270, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3022, 9253, 0), -1, true, true);
        World.spawnNPC(13820, new WorldTile(3015, 9259, 0), -1, true, true);

        /*Guards*/
        World.spawnNPC(13821, new WorldTile(3065, 9243, 0), -1, true, true);
        World.spawnNPC(13821, new WorldTile(3034, 9235, 0), -1, true, true);

        /*Males*/
        World.spawnNPC(13822, new WorldTile(3043, 9239, 0), -1, true, true);
        World.spawnNPC(13822, new WorldTile(3043, 9265, 0), -1, true, true);

        World.spawnNPC(6222, new WorldTile(2828, 5302, 2), -1, true, true);
        World.spawnNPC(6203, new WorldTile(2934, 5324, 2), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2700, 3715, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2696, 3719, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2706, 3724, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2711, 3719, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2717, 3726, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2721, 3717, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2721, 3706, 0), -1, true, true);
        World.spawnNPC(1265, new WorldTile(2716, 3700, 0), -1, true, true);
        //End Crabs start abyss
        World.spawnNPC(1615, new WorldTile(3029, 4842, 0), -1, true, true);
        World.spawnNPC(3200, new WorldTile(3026, 4829, 0), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3033, 4821, 0), -1, true, true);
        World.spawnNPC(3200, new WorldTile(3047, 4822, 0), -1, true, true);
        World.spawnNPC(1615, new WorldTile(3051, 4837, 0), -1, true, true);
        //Start thieving npcs and home wolfs
        World.spawnNPC(1, new WorldTile(3490, 3491, 0), -1, true, true);
        World.spawnNPC(2, new WorldTile(3503, 3488, 0), -1, true, true);
        World.spawnNPC(4, new WorldTile(3490, 3483, 0), -1, true, true);
        World.spawnNPC(5, new WorldTile(3507, 3503, 0), -1, true, true);
        World.spawnNPC(7, new WorldTile(3472, 3499, 0), -1, true, true);
        World.spawnNPC(15, new WorldTile(3482, 3476, 0), -1, true, true);
        World.spawnNPC(1715, new WorldTile(3479, 3496, 1), -1, true, true);
        World.spawnNPC(1714, new WorldTile(3497, 3474, 1), -1, true, true);
        //Start of fishing
        World.spawnNPC(327, new WorldTile(2478, 5128, 0), -1, true, true);
        World.spawnNPC(328, new WorldTile(2484, 5134, 0), -1, true, true);
        World.spawnNPC(312, new WorldTile(2488, 5137, 0), -1, true, true);
        World.spawnNPC(6267, new WorldTile(2492, 5128, 0), -1, true, true);
        //Start dragons
        //Start Dags
        World.spawnNPC(2881, new WorldTile(2423, 4697, 0), -1, true, true);
        World.spawnNPC(2882, new WorldTile(2425, 4709, 0), -1, true, true);
        World.spawnNPC(2883, new WorldTile(2422, 4721, 0), -1, true, true);
        //Start STQ
        World.spawnNPC(3847, new WorldTile(2323, 4593, 0), -1, true, true);
        //Start Snails
        World.spawnNPC(1227, new WorldTile(2861, 9732, 0), -1, true, true);
        World.spawnNPC(1228, new WorldTile(2857, 9733, 0), -1, true, true);
        World.spawnNPC(1229, new WorldTile(2858, 9738, 0), -1, true, true);
        World.spawnNPC(1230, new WorldTile(2861, 9738, 0), -1, true, true);
        World.spawnNPC(1231, new WorldTile(2866, 9736, 0), -1, true, true);
        World.spawnNPC(1232, new WorldTile(2862, 9734, 0), -1, true, true);
        World.spawnNPC(1233, new WorldTile(2860, 9733, 0), -1, true, true);
        World.spawnNPC(1234, new WorldTile(2859, 9736, 0), -1, true, true);
        World.spawnNPC(1235, new WorldTile(2860, 9740, 0), -1, true, true);
        //Hunter
        World.spawnNPC(5080, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(5081, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(6916, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(7272, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(6942, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(1192, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(5073, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(5075, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(5074, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(5072, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(7031, new WorldTile(2715, 9203, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(5081, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(6916, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(7272, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(6942, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(1192, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(5073, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(5075, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(5074, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(5072, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(7031, new WorldTile(2732, 9186, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(5081, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(6916, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(7272, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(6942, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(1192, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(5073, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(5075, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(5074, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(5072, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(7031, new WorldTile(2714, 9170, 0), -1, true, true);
        World.spawnNPC(5080, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(5081, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(6916, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(7272, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(6942, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(1192, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(5073, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(5075, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(5074, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(5072, new WorldTile(2699, 9186, 0), -1, true, true);
        World.spawnNPC(7031, new WorldTile(2699, 9186, 0), -1, true, true);
        //Ardy thieving stall area and guards and scorps
        World.spawnNPC(21, new WorldTile(2664, 3310, 0), -1, true, true);
        World.spawnNPC(20, new WorldTile(2664, 3310, 0), -1, true, true);
        World.spawnNPC(23, new WorldTile(2664, 3310, 0), -1, true, true);
        World.spawnNPC(21, new WorldTile(2664, 3301, 0), -1, true, true);
        World.spawnNPC(20, new WorldTile(2664, 3301, 0), -1, true, true);
        World.spawnNPC(23, new WorldTile(2664, 3301, 0), -1, true, true);
        World.spawnNPC(21, new WorldTile(2659, 3306, 0), -1, true, true);
        World.spawnNPC(20, new WorldTile(2659, 3306, 0), -1, true, true);
        World.spawnNPC(23, new WorldTile(2659, 3306, 0), -1, true, true);
        World.spawnNPC(2, new WorldTile(2655, 3314, 0), -1, true, true);
        World.spawnNPC(2, new WorldTile(2656, 3298, 0), -1, true, true);
        World.spawnNPC(2, new WorldTile(2667, 3299, 0), -1, true, true);
        World.spawnNPC(2, new WorldTile(2667, 3314, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(2965, 3396, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(2965, 3396, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(2965, 3396, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(2965, 3396, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(19, new WorldTile(2972, 3343, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3007, 3323, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3007, 3323, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3007, 3323, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3007, 3323, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3270, 3429, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3270, 3429, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3275, 3428, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3275, 3428, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3175, 3428, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3175, 3428, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3175, 3428, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3211, 3381, 0), -1, true, true);
        World.spawnNPC(9, new WorldTile(3211, 3381, 0), -1, true, true);
        World.spawnNPC(172, new WorldTile(3227, 3372, 0), -1, true, true);
        World.spawnNPC(174, new WorldTile(3227, 3372, 0), -1, true, true);
        World.spawnNPC(172, new WorldTile(3227, 3372, 0), -1, true, true);
        World.spawnNPC(174, new WorldTile(3228, 3367, 0), -1, true, true);
        World.spawnNPC(172, new WorldTile(3228, 3367, 0), -1, true, true);
        World.spawnNPC(174, new WorldTile(3228, 3367, 0), -1, true, true);
        World.spawnNPC(107, new WorldTile(3299, 3387, 0), -1, true, true);
        World.spawnNPC(107, new WorldTile(3300, 3294, 0), -1, true, true);
        World.spawnNPC(107, new WorldTile(3295, 3299, 0), -1, true, true);
        World.spawnNPC(107, new WorldTile(3299, 3306, 0), -1, true, true);
        World.spawnNPC(107, new WorldTile(3299, 3313, 0), -1, true, true);
        World.spawnNPC(107, new WorldTile(3299, 3313, 0), -1, true, true);
        //Living Rock Caves
        World.spawnNPC(7044, new WorldTile(3626, 5113, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3624, 5128, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3634, 5143, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3654, 5141, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3696, 5141, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3695, 5137, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3682, 5110, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3677, 5111, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3649, 5083, 0), -1, true, true);
        World.spawnNPC(7044, new WorldTile(3629, 5083, 0), -1, true, true);
        World.spawnNPC(8832, new WorldTile(3644, 5096, 0), -1, true, true);
        World.spawnNPC(8833, new WorldTile(3632, 5090, 0), -1, true, true);
        World.spawnNPC(8834, new WorldTile(3635, 5107, 0), -1, true, true);
        World.spawnNPC(82, new WorldTile(3668, 5088, 0), -1, true, true);
        World.spawnNPC(82, new WorldTile(3679, 5097, 0), -1, true, true);
        World.spawnNPC(83, new WorldTile(3669, 5114, 0), -1, true, true);
        World.spawnNPC(83, new WorldTile(3664, 5125, 0), -1, true, true);
        World.spawnNPC(84, new WorldTile(3672, 5135, 0), -1, true, true);
        World.spawnNPC(84, new WorldTile(3685, 5134, 0), -1, true, true);
        World.spawnNPC(84, new WorldTile(3677, 5154, 0), -1, true, true);
        World.spawnNPC(83, new WorldTile(3653, 5137, 0), -1, true, true);
        World.spawnNPC(84, new WorldTile(3642, 5145, 0), -1, true, true);
        World.spawnNPC(8834, new WorldTile(3628, 5120, 0), -1, true, true);
        World.spawnNPC(327, new WorldTile(2595, 3423, 0), -1, true, true);
        World.spawnNPC(328, new WorldTile(2598, 3419, 0), -1, true, true);
        World.spawnNPC(312, new WorldTile(2488, 5137, 0), -1, true, true);
        World.spawnNPC(6267, new WorldTile(2594, 3424, 0), -1, true, true);
        World.spawnNPC(327, new WorldTile(4079, 4904, 0), -1, true, true);
        World.spawnNPC(328, new WorldTile(4076, 4904, 0), -1, true, true);
        World.spawnNPC(312, new WorldTile(4073, 4904, 0), -1, true, true);
        //NEW HOME WITH SKILLS SHOPS
        World.spawnNPC(521, new WorldTile(3682, 3477, 0), -1, true, true);
        World.spawnNPC(522, new WorldTile(3679, 3469, 0), -1, true, true);
        World.spawnNPC(521, new WorldTile(3682, 3477, 0), -1, true, true);

        World.spawnNPC(8009, new WorldTile(5856, 4703, 0), -1, false, true);

        World.spawnNPC(3374, new WorldTile(5893, 4699, 0), -1, false, true);
        World.spawnNPC(3709, new WorldTile(5884, 4699, 0), -1, true, true);
        //old home shops
        //World.spawnNPC(6537, new WorldTile(3480, 3498, 0), -1, true, true);
        World.spawnNPC(519, new WorldTile(5868, 4714, 0), -1, true, true);
        World.spawnNPC(12379, new WorldTile(5865, 4705, 0), -1, true, true);
        //	World.spawnNPC(8443, new WorldTile(3156, 3480, 0), -1, false, true);
//		World.spawnNPC(520, new WorldTile(3158, 3483, 0), -1, true, true);
//		World.spawnNPC(521, new WorldTile(3153, 3482, 0), -1, true, true);
//		World.spawnNPC(522, new WorldTile(3150, 3493, 0), -1, true, true);
//		World.spawnNPC(523, new WorldTile(3146, 3492, 0), -1, true, true);
//		World.spawnNPC(524, new WorldTile(3149, 3490, 0), -1, true, true);
//		World.spawnNPC(525, new WorldTile(3150, 3485, 0), -1, true, true);
//		World.spawnNPC(526, new WorldTile(3164, 3478, 0), -1, true, true);
//		World.spawnNPC(527, new WorldTile(3168, 3476, 0), -1, true, true);
//		World.spawnNPC(528, new WorldTile(3167, 3472, 1), -1, true, true);
//		World.spawnNPC(529, new WorldTile(3156, 3473, 0), -1, true, true);
//		World.spawnNPC(530, new WorldTile(3157, 3492, 0), -1, true, true);
//		World.spawnNPC(531, new WorldTile(3163, 3498, 0), -1, true, true);
//		World.spawnNPC(534, new WorldTile(3168, 3505, 0), -1, true, true);
//		World.spawnNPC(535, new WorldTile(3177, 3495, 0), -1, true, true);
//		World.spawnNPC(551, new WorldTile(3173, 3492, 0), -1, true, true);
//		World.spawnNPC(552, new WorldTile(3176, 3488, 0), -1, true, true);
//		World.spawnNPC(554, new WorldTile(3167, 3487, 0), -1, true, true);
//		World.spawnNPC(555, new WorldTile(3162, 3487, 0), -1, true, true);
        //World.spawnNPC(561, new WorldTile(3500, 3469, 0), -1, true, true);
        World.spawnNPC(1699, new WorldTile(5862, 4694, 0), -1, true, true);
        World.spawnNPC(1917, new WorldTile(5857, 4693, 0), -1, true, true);
//		World.spawnNPC(11678, new WorldTile(2870, 10206, 0), -1, true, true);
        World.spawnNPC(11679, new WorldTile(5857, 4686, 0), -1, true, true);
        World.spawnNPC(536, new WorldTile(5863, 4684, 0), -1, true, true);
        World.spawnNPC(537, new WorldTile(5873, 4694, 0), -1, true, true);
        //	World.spawnNPC(538, new WorldTile(2863, 10206, 0), -1, true, true);
        //	World.spawnNPC(556, new WorldTile(2863, 10204, 0), -1, true, true);
        World.spawnNPC(540, new WorldTile(5884, 4691, 0), -1, true, true);
        World.spawnNPC(541, new WorldTile(5891, 4692, 0), -1, true, true);

        World.spawnNPC(6893, new WorldTile(5901, 4696, 0), -1, true, true);
        /* ------end of new home ---------*/
        World.spawnNPC(2676, new WorldTile(5911, 4718, 0), -1, true, true);//makover mage
        World.spawnNPC(8443, new WorldTile(5904, 4714, 0), -1, true, true);//

        World.spawnNPC(8528, new WorldTile(3360, 5860, 0), -1, true, true);// nomad

        World.spawnNPC(8461, new WorldTile(5874, 4713, 0), -1, true, true);//slayer
        World.spawnNPC(550, new WorldTile(5854, 4704, 0), -1, true, true);//range

        //	World.spawnNPC(445, new WorldTile(3173, 3488, 0), -1, true, true);//frog runes
        World.spawnNPC(519, new WorldTile(5859, 4709, 0), -1, true, true);//bob

        //	World.spawnNPC(576, new WorldTile(3173, 3486, 0), -1, true, true);//harry
        World.spawnNPC(2253, new WorldTile(5868, 4717, 0), -1, true, true);//skillcape

        // World.spawnNPC(6537, new WorldTile(3087, 3500, 0), -1, true, true);  // mandrith

        /* ------------ Glacors ------------*/
        World.spawnNPC(14301, new WorldTile(4194, 5716, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4190, 5708, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4182, 5708, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4714, 5722, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4192, 5720, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4203, 5716, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4176, 5721, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4171, 5715, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4184, 5717, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4212, 5710, 0), -1, true, true);
        World.spawnNPC(14301, new WorldTile(4212, 5718, 0), -1, true, true);

        World.spawnObject(new WorldObject(59731, 10, 0, 3161,3466, 0), true);
        World.spawnObject(new WorldObject(2213, 10, 0, 3171, 9766, 0), true);
        World.spawnObject(new WorldObject(2213, 10, 0, 3681, 3468, 0), true);
        World.spawnObject(new WorldObject(2213, 10, 0, 3293, 3297, 0), true);
        World.spawnObject(new WorldObject(2478, 10, 0, 3189, 5718, 0), true);
        World.spawnObject(new WorldObject(2479, 10, 0, 3189, 5715, 0), true);
        World.spawnObject(new WorldObject(2480, 10, 0, 3189, 5710, 0), true);
        World.spawnObject(new WorldObject(2481, 10, 0, 3175, 5710, 0), true);
        World.spawnObject(new WorldObject(2482, 10, 0, 3176, 5716, 0), true);
        World.spawnObject(new WorldObject(2483, 10, 0, 3181, 5716, 0), true);
        World.spawnObject(new WorldObject(2484, 10, 0, 3193, 5713, 0), true);
        World.spawnObject(new WorldObject(2485, 10, 0, 3185, 5711, 0), true);
        World.spawnObject(new WorldObject(2486, 10, 0, 3179, 5710, 0), true);
        World.spawnObject(new WorldObject(2487, 10, 0, 3180, 5718, 0), true);
        World.spawnObject(new WorldObject(2488, 10, 0, 3184, 5708, 0), true);
        World.spawnObject(new WorldObject(17010, 10, 0, 3187, 5724, 0), true);
        World.spawnObject(new WorldObject(30624, 10, 0, 3188, 5721, 0), true);
        World.spawnObject(new WorldObject(409, 10,0, 3164,3467, 0), true); // hoem altar
        
        World.spawnObject(new WorldObject(2403, 10, 2, 3043,4978, 1), true); //rfd chest
  
        World.spawnObject(new WorldObject(172, 10, 2, 3158,3462, 0), true);
     
        /**
         * Home thieving stalls
         */
        World.spawnObject(new WorldObject(4876, 10, 0, 3157, 3466, 0), true);
        World.spawnObject(new WorldObject(4875, 10, 0, 3155, 3466, 0), true);
        World.spawnObject(new WorldObject(4877, 10, 0, 3153, 3466, 0), true);

        World.spawnObject(new WorldObject(4874, 10, 0, 3151, 3466, 0), true);
    }

    /**
     * The NPC classes.
     */
    private static final Map<Integer, Class<?>> CUSTOM_NPCS = new HashMap<Integer, Class<?>>();

    public static void npcSpawn() {
        int size = 0;
        boolean ignore = false;
        try {
            for (String string : FileUtilities
                    .readFile("data/npcs/npcspawns.txt")) {
                if (string.startsWith("//") || string.equals("")) {
                    continue;
                }
                if (string.contains("/*")) {
                    ignore = true;
                    continue;
                }
                if (ignore) {
                    if (string.contains("*/")) {
                        ignore = false;
                    }
                    continue;
                }
                String[] spawn = string.split(" ");
                @SuppressWarnings("unused")
                int id = Integer.parseInt(spawn[0]), x = Integer
                        .parseInt(spawn[1]), y = Integer.parseInt(spawn[2]), z = Integer
                        .parseInt(spawn[3]), faceDir = Integer
                        .parseInt(spawn[4]);
                NPC npc = null;
                Class<?> npcHandler = CUSTOM_NPCS.get(id);
                if (npcHandler == null) {
                    npc = new NPC(id, new WorldTile(x, y, z), -1, true, false);
                } else {
                    npc = (NPC) npcHandler.getConstructor(int.class)
                            .newInstance(id);
                }
                if (npc != null) {
                    WorldTile spawnLoc = new WorldTile(x, y, z);
                    npc.setLocation(spawnLoc);
                    World.spawnNPC(npc.getId(), spawnLoc, -1, true, false);
                    size++;
                }
            }
        } catch (NumberFormatException e1) {
            e1.printStackTrace();
        } catch (IllegalArgumentException e1) {
            e1.printStackTrace();
        } catch (SecurityException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        }
        System.err.println("Loaded " + size + " custom npc spawns!");
    }

}
